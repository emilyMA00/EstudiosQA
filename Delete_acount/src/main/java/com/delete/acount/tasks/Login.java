package com.delete.acount.tasks;


import com.delete.acount.userinterfaces.Homepage;
import com.delete.acount.userinterfaces.Loginpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Enter.theValue;

public class Login implements Task {

    private final String email;
    private final String password;

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static Login withCredentials(String email, String password) {
        return instrumented(Login.class, email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(Homepage.SIGNUP_LOGIN),
                theValue(email).into(Loginpage.EMAIL_LOGIN_INPUT),
                theValue(password).into(Loginpage.PASSWORD_LOGIN_INPUT),
                on(Loginpage.LOGIN_BUTTON)
        );
    }
}
