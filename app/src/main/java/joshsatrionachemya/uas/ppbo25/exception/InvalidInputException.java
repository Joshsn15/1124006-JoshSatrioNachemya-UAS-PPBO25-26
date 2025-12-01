package joshsatrionachemya.uas.ppbo25.exception;

public class InvalidInputException extends Exception {

    public InvalidInputException() {
        super("Menu harus berupa angka antara 1 dan 3");
    }

    public InvalidInputException(int input) throws InvalidInputException{
        throw new InvalidInputException();
    }

    
}
