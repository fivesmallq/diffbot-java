package im.nll.data.diffbot.model;

/**
 * diffbot api request model
 *
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 16/6/28 下午6:43
 */
public class Request {
    private String token;
    private String url;
    private String fields;
    private String paging;
    private String maxTags;
    private String tagConfidence;
    private String discussion;
    private String timeout;
    private String callback;

    public static Request newRequest(String url) {
        Request request = new Request();
        request.setUrl(url);
        return request;
    }

    public static Request newRequest(String url, Long timeout) {
        Request request = new Request();
        request.setUrl(url);
        request.setTimeout(String.valueOf(timeout));
        return request;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getPaging() {
        return paging;
    }

    public void setPaging(String paging) {
        this.paging = paging;
    }

    public String getMaxTags() {
        return maxTags;
    }

    public void setMaxTags(String maxTags) {
        this.maxTags = maxTags;
    }

    public String getTagConfidence() {
        return tagConfidence;
    }

    public void setTagConfidence(String tagConfidence) {
        this.tagConfidence = tagConfidence;
    }

    public String getDiscussion() {
        return discussion;
    }

    public void setDiscussion(String discussion) {
        this.discussion = discussion;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
