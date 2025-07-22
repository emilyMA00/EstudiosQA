package com.login.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationPage {
    public static final Target LOGIN_LINK = Target.the("Login link")
            .located(By.xpath("//a[contains(text(),'Signup / Login')]"));

    public static final Target NAME_INPUT = Target.the("Name input")
            .located(By.xpath("//input[@data-qa='signup-name']"));

    public static final Target EMAIL_INPUT = Target.the("Email input")
            .located(By.xpath("//input[@data-qa='signup-email']"));

    public static final Target SIGNUP_BUTTON = Target.the("Signup button")
            .located(By.xpath("//button[@data-qa='signup-button']"));

    public static final Target PASSWORD_INPUT = Target.the("Password input")
            .located(By.id("password"));

    public static final Target CREATE_BUTTON = Target.the("Create account")
            .located(By.xpath("//button[@data-qa='create-account']"));

    public static final Target LOGIN_EMAIL = Target.the("Login email")
            .located(By.xpath("//input[@data-qa='login-email']"));

    public static final Target LOGIN_PASSWORD = Target.the("Login password")
            .located(By.xpath("//input[@data-qa='login-password']"));

    public static final Target LOGIN_BUTTON = Target.the("Login button")
            .located(By.xpath("//button[@data-qa='login-button']"));

    public static final Target LOGGED_IN_TEXT = Target.the("Logged in text")
            .located(By.xpath("//a[contains(text(),'Logged in as')]"));
}
