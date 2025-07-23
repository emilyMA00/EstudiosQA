package com.delete.acount.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Registerpage {
    public static final Target PASSWORD = Target.the("Password").located(By.id("password"));
    public static final Target FIRST_NAME = Target.the("First Name").located(By.id("first_name"));
    public static final Target LAST_NAME = Target.the("Last Name").located(By.id("last_name"));
    public static final Target ADDRESS = Target.the("Address").located(By.id("address1"));
    public static final Target STATE = Target.the("State").located(By.id("state"));
    public static final Target CITY = Target.the("City").located(By.id("city"));
    public static final Target ZIPCODE = Target.the("Zipcode").located(By.id("zipcode"));
    public static final Target MOBILE = Target.the("Mobile").located(By.id("mobile_number"));
    public static final Target CREATE_ACCOUNT = Target.the("Create Account button").located(By.xpath("//button[@data-qa='create-account']"));
    public static final Target CONTINUE_BUTTON = Target.the("Continue button").located(By.xpath("//a[@data-qa='continue-button']"));
}

