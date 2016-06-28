package im.nll.data.diffbot.exception;

/**
 * process exception.
 *
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 16/6/28 下午6:11
 */
public class ProcessException extends RuntimeException {

    public ProcessException(String message) {
        super(message);
    }

    public ProcessException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProcessException() {
        super();
    }

    public ProcessException(Throwable cause) {
        super(cause);
    }
}
