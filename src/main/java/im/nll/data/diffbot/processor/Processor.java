package im.nll.data.diffbot.processor;

/**
 * processor
 *
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 16/6/28 下午6:07
 */
public interface Processor<T> {
    /**
     * process diffbot return html to java bean.
     *
     * @param html
     * @return
     */
    T process(String html);
}
