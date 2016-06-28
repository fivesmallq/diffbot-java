package im.nll.data.diffbot.model;

import java.util.List;

/**
 * diffbot article v3 model. see https://www.diffbot.com/dev/docs/article/
 *
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 16/6/28 下午6:06
 */
public class Article {
    private String type;
    private String title;
    private String text;
    private String html;
    private String date;
    private String estimatedDate;
    private String author;
    private String authorUrl;
    private String discussion;
    private String humanLanguage;
    private String numPages;
    private String nextPages;
    private String siteName;
    private String publisherRegion;
    private String publisherCountry;
    private String pageUrl;
    private String resolvedPageUrl;
    private String breadcrumb;
    private String diffbotUri;
    private List<Tag> tags;
    private List<Image> images;
    private List<Video> videos;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEstimatedDate() {
        return estimatedDate;
    }

    public void setEstimatedDate(String estimatedDate) {
        this.estimatedDate = estimatedDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    public String getDiscussion() {
        return discussion;
    }

    public void setDiscussion(String discussion) {
        this.discussion = discussion;
    }

    public String getHumanLanguage() {
        return humanLanguage;
    }

    public void setHumanLanguage(String humanLanguage) {
        this.humanLanguage = humanLanguage;
    }

    public String getNumPages() {
        return numPages;
    }

    public void setNumPages(String numPages) {
        this.numPages = numPages;
    }

    public String getNextPages() {
        return nextPages;
    }

    public void setNextPages(String nextPages) {
        this.nextPages = nextPages;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getPublisherRegion() {
        return publisherRegion;
    }

    public void setPublisherRegion(String publisherRegion) {
        this.publisherRegion = publisherRegion;
    }

    public String getPublisherCountry() {
        return publisherCountry;
    }

    public void setPublisherCountry(String publisherCountry) {
        this.publisherCountry = publisherCountry;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getResolvedPageUrl() {
        return resolvedPageUrl;
    }

    public void setResolvedPageUrl(String resolvedPageUrl) {
        this.resolvedPageUrl = resolvedPageUrl;
    }

    public String getBreadcrumb() {
        return breadcrumb;
    }

    public void setBreadcrumb(String breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

    public String getDiffbotUri() {
        return diffbotUri;
    }

    public void setDiffbotUri(String diffbotUri) {
        this.diffbotUri = diffbotUri;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
