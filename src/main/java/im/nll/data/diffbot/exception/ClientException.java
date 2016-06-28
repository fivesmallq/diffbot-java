package im.nll.data.diffbot.exception;

/**
 * client exception.
 *
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 16/6/28 下午6:11
 */
public class ClientException extends RuntimeException {

    public ClientException(String message) {
        super(message);
    }

    public ClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClientException() {
        super();
    }

    public ClientException(Throwable cause) {
        super(cause);
    }
}
