package ru.skypro.HomeWork_2_5.exception;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException(String message){
        super(message);

    }

}
