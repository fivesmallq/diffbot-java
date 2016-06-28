package im.nll.data.diffbot;

import im.nll.data.diffbot.model.Article;
import im.nll.data.diffbot.processor.ArticleProcessor;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

/**
 * client.
 *
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 16/6/28 下午6:01
 */
public class DiffbotClient {
    private String baseUrl = "https://api.diffbot.com/v3/article?";
    /**
     * access token
     */
    private String token;

    /**
     * request timeout,default 60s
     */
    private long timeout = 60000;

    private DiffbotClient(String token) {
        this.token = token;
    }

    /**
     * init client with token and request timeout
     *
     * @param token
     * @param timeout
     */
    private DiffbotClient(String token, long timeout) {
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
    public static DiffbotClient newClient(String token, long timeout) {
        return new DiffbotClient(token, timeout);
    }

    public Article article(String url) {
        String html = "";
        try {
            html = Request.Get(getBaseUrl(url)).execute().returnContent().asString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArticleProcessor().process(html);
    }

    private String getBaseUrl(String url) {
        return baseUrl + "token=" + this.token + "&url=" + url;
    }
}
