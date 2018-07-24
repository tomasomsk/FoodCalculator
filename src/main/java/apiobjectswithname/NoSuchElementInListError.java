package apiobjectswithname;

public class NoSuchElementInListError extends Error {

    public NoSuchElementInListError(String message) {
        super(message);
    }
    public NoSuchElementInListError(Throwable cause) {
        super(cause);
    }

    public NoSuchElementInListError(String message, Throwable cause) {
        super(message, cause);
    }

}
