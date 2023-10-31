package it.cgmconsulting.pistillo.exception;

public class InvalidRentalRequestException extends Exception {

    public InvalidRentalRequestException() {
        super();
    }

    public InvalidRentalRequestException(String message) {
        super(message);
    }

    public InvalidRentalRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidRentalRequestException(Throwable cause) {
        super(cause);
    }
}

