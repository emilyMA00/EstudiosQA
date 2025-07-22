package com.wilder.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MakeBuy {

    public static final Target BOlSO = Target.the("logeo")
            .locatedBy("/html/body/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/a");

    public static final Target SECCION_BOLSO = Target.the("seccion bolso")
            .located(By.id("menu-item-8"));

    public static final Target CLAVE = Target.the("campo de contraseña")
            .located(By.id("password"));

    public static final Target BOTON_LOGIN = Target.the("Save button")
            .locatedBy("//button[contains(., 'Acceso')]");
}
