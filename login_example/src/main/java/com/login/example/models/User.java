package com.login.example.models;

public class User {
    public String name;
    public String email;
    public String password;

    public static User withRandomData() {
        User user = new User();
        user.name = "Emily";
        user.email = "skztxt02" + System.currentTimeMillis() + "@gmail.com";
        user.password = "Password123";
        return user;
    }
}
