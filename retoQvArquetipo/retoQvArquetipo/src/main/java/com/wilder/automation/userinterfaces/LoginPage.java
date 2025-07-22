package com.wilder.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target LOGEO = Target.the("logeo")
            .locatedBy("//*[@id='header']/div/div[3]/div[2]/a");

    public static final Target USUARIO = Target.the("campo de usuario")
            .located(By.id("username"));

    public static final Target CLAVE = Target.the("campo de contraseña")
            .located(By.id("password"));

    public static final Target BOTON_LOGIN = Target.the("Save button")
            .locatedBy("//button[contains(., 'Acceso')]");



}
