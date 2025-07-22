package com.login.models;


public class UserData {
    private final String name;
    private final String email;
    private final String password;

    public UserData(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String name() { return name; }
    public String email() { return email; }
    public String password() { return password; }
}



