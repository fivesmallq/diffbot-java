package im.nll.data.diffbot.model;

/**
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 16/6/28 下午7:00
 */
public class Video {
    private String url;
    private String naturalHeight;
    private String naturalWidth;
    private String primary;
    private String diffbotUri;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNaturalHeight() {
        return naturalHeight;
    }

    public void setNaturalHeight(String naturalHeight) {
        this.naturalHeight = naturalHeight;
    }

    public String getNaturalWidth() {
        return naturalWidth;
    }

    public void setNaturalWidth(String naturalWidth) {
        this.naturalWidth = naturalWidth;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public String getDiffbotUri() {
        return diffbotUri;
    }

    public void setDiffbotUri(String diffbotUri) {
        this.diffbotUri = diffbotUri;
    }
}
