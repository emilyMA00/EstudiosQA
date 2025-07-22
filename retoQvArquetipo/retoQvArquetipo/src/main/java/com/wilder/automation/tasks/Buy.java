package com.wilder.automation.tasks;

import com.wilder.automation.userinterfaces.LoginPage;
import com.wilder.automation.userinterfaces.MakeBuy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Buy implements Task {

    private final String name;

    public Buy(String name) {
        this.name = name;
    }
    public static Buy makeBuy(String name) {
        return Tasks.instrumented(Buy.class, name);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
         //       Click.on(LoginPage.LOGEO)
            //    Click.on(MakeBuy.)
             //   Enter.theValue(usuario).into(LoginPage.USUARIO),
            //    Enter.theValue(clave).into(LoginPage.CLAVE),
             //   Click.on(LoginPage.BOTON_LOGIN)
        );
    }
}
