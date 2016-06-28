package im.nll.data.diffbot.model;

/**
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 16/6/28 下午6:32
 */
public class Image {
    private String url;
    private String title;
    private String height;
    private String width;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
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
