package com.login.example.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Homepage {
    public static final Target SIGNUP_LOGIN = Target.the("Signup/Login").located(By.xpath("//a[contains(text(),'Signup / Login')]"));
    public static final Target LOGOUT = Target.the("Logout").located(By.xpath("//a[contains(text(),'Logout')]"));
    public static final Target LOGGED_IN_AS = Target.the("Logged in as").located(By.xpath("//a[contains(text(),'Logged in as')]"));
}