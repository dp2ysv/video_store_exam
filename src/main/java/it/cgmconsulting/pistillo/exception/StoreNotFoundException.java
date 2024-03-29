package it.cgmconsulting.pistillo.exception;

public class StoreNotFoundException extends Exception {

    public StoreNotFoundException() {
        super();
    }

    public StoreNotFoundException(String message) {
        super(message);
    }

    public StoreNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StoreNotFoundException(Throwable cause) {
        super(cause);
    }
}

