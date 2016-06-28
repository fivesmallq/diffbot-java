package im.nll.data.diffbot;

import com.alibaba.fastjson.JSON;
import im.nll.data.diffbot.model.Article;
import org.junit.Before;
import org.junit.Test;

/**
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 16/6/28 下午7:05
 */
public class DiffbotClientTest {
    private String token = "testdrivexicwtiygezqa";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void newClient() throws Exception {
        String url = "http://www.bloomberg.com/news/articles/2016-03-07/alibaba-finance-affiliate-buy-h-k-firm-for-china-lotteries";
        Article article = DiffbotClient.newClient(token).article(url);
        System.out.println(JSON.toJSONString(article, true));
    }

}
