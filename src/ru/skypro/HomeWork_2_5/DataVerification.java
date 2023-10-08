package ru.skypro.HomeWork_2_5;

import ru.skypro.HomeWork_2_5.exception.WrongLoginException;
import ru.skypro.HomeWork_2_5.exception.WrongPasswordException;

public class DataVerification {

    public final static String alf = "[\\w_]+";
    public static void check(DataInput dataInput){
        if (dataInput.getLogin().length()>20||dataInput.getLogin().length()<5||!dataInput.getLogin().matches(alf)){
            throw new WrongLoginException("Логин не подходит, введите заново");
        }
        if (dataInput.getPassword().length()>20||dataInput.getPassword().length()<5||!dataInput.getPassword().matches(alf)){
            throw new WrongPasswordException("Пароль не подходит, введите заново");
        }
        if (!dataInput.getConfirmPassword().equals(dataInput.getPassword())){
            throw new WrongPasswordException("Пароль не подходит, введите заново");
        }else{
            System.out.println("Данные введены верно");
        }


    }
}
