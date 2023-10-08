package ru.skypro.HomeWork_2_5;

public class DataInput {

    private String login;
    private String password;
    private String confirmPassword ;

    public DataInput(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }



    public String getConfirmPassword() {
        return confirmPassword;
    }



}
