package com.wilder.automation.tasks;

import com.wilder.automation.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Tasks;

public class Login implements Task {

    private final String usuario;
    private final String clave;

    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public static Login withCredentials(String usuario, String clave) {
        return Tasks.instrumented(Login.class, usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.LOGEO),
                Enter.theValue(usuario).into(LoginPage.USUARIO),
                Enter.theValue(clave).into(LoginPage.CLAVE),
                Click.on(LoginPage.BOTON_LOGIN)
        );
    }
}
