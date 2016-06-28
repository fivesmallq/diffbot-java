package im.nll.data.diffbot;

import im.nll.data.diffbot.exception.ClientException;
import im.nll.data.diffbot.exception.ProcessException;
import im.nll.data.diffbot.model.Article;
import im.nll.data.diffbot.processor.ArticleProcessor;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * client.
 *
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 16/6/28 下午6:01
 */
public class DiffbotClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(DiffbotClient.class);
    private static final String TYPE_ARTICLE = "article";
    private static final String VERSION = "3";
    /**
     * access token
     */
    private String token;

    /**
     * request timeout,default 60s
     */
    private int timeout = 60000;

    private DiffbotClient(String token) {
        this.token = token;
    }

    /**
     * init client with token and request timeout
     *
     * @param token
     * @param timeout ms
     */
    private DiffbotClient(String token, int timeout) {
        this.token = token;
        this.timeout = timeout;
    }

    /**
     * create diffbot client with token
     *
     * @param token
     * @return
     */
    public static DiffbotClient newClient(String token) {
        return new DiffbotClient(token);
    }

    /**
     * create diffbot client with token and request timeout
     *
     * @param token
     * @param timeout
     * @return
     */
    public static DiffbotClient newClient(String token, int timeout) {
        return new DiffbotClient(token, timeout);
    }

    public Article article(String url) {
        Article article = null;
        String html = "";
        try {
            String requestUrl = getArticleAPI(url);
            LOGGER.debug("Request '{}'", requestUrl);
            html = Request.Get(requestUrl).socketTimeout(timeout).connectTimeout(timeout).execute().returnContent().asString();
            if (isNotNullOrEmpty(html)) {
                //XXX WTF API
                if (html.indexOf("errorCode") > 0 && html.indexOf("errorCode") < 30) {
                    throw new ClientException(html);
                }
            }
            LOGGER.debug("Response html '{}'", html);
        } catch (IOException e) {
            throw new ClientException(e);
        }
        try {
            article = new ArticleProcessor().process(html);
        } catch (Exception e) {
            throw new ProcessException(e);
        }
        return article;
    }

    private String getArticleAPI(String url) {
        URIBuilder ub = new URIBuilder()
                .setScheme("https")
                .setHost("api.diffbot.com")
                .setPath("/v" + VERSION + "/" + TYPE_ARTICLE);
        ub.setParameter("token", token);
        ub.setParameter("url", url);
        return ub.toString();
    }

    private static boolean isNullOrEmpty(String content) {
        return content == null || content.length() == 0
                || "null".equals(content);
    }

    private static boolean isNotNullOrEmpty(String content) {
        return (content != null) && (content.length() > 0);
    }
}
