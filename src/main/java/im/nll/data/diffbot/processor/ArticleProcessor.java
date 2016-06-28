package im.nll.data.diffbot.processor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import im.nll.data.diffbot.model.Article;

/**
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 16/6/28 下午6:09
 */
public class ArticleProcessor implements Processor<Article> {
    @Override
    public Article process(String html) {
        JSONObject jsonObject = JSON.parseObject(html);
        JSONArray jsonArray = jsonObject.getJSONArray("objects");
        if (!jsonArray.isEmpty()) {
            return jsonArray.getObject(0, Article.class);
        }
        return null;
    }
}
