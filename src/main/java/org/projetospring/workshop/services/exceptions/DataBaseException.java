package org.projetospring.workshop.services.exceptions;

public class DataBaseException extends RuntimeException {

    public DataBaseException(String message) {
        super(message);
    }
}
