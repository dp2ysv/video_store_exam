package it.cgmconsulting.pistillo.exception;


public class FilmNotFoundException extends RuntimeException {

    public FilmNotFoundException(String message) {
        super(message);
    }

    public FilmNotFoundException(Long filmId) {
        super("Nessun film trovato con l'ID: " + filmId);
    }

}

