package com.login.example.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Loginpage {
    public static final Target NAME_INPUT = Target.the("Name input").located(By.name("name"));
    public static final Target EMAIL_SIGNUP_INPUT = Target.the("Email input for signup").located(By.xpath("//input[@data-qa='signup-email']"));
    public static final Target SIGNUP_BUTTON = Target.the("Signup button").located(By.xpath("//button[contains(text(),'Signup')]"));

    public static final Target EMAIL_LOGIN_INPUT = Target.the("Email for login").located(By.name("email"));
    public static final Target PASSWORD_LOGIN_INPUT = Target.the("Password for login").located(By.name("password"));
    public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.xpath("//button[@data-qa='login-button']"));
}
