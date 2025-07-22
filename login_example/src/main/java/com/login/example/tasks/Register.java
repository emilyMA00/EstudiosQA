package com.login.example.tasks;

import com.login.example.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import com.login.example.ui.Homepage;
import com.login.example.ui.Loginpage;
import com.login.example.ui.Registerpage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Enter.theValue;

public class Register implements Task {
    private final User user;

    public Register(User user) {
        this.user = user;
    }

    public static Register with(User user) {
        return instrumented(Register.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(Homepage.SIGNUP_LOGIN),
                theValue(user.name).into(Loginpage.NAME_INPUT),
                theValue(user.email).into(Loginpage.EMAIL_SIGNUP_INPUT),
                on(Loginpage.SIGNUP_BUTTON),

                theValue(user.password).into(Registerpage.PASSWORD),
                theValue("Emily").into(Registerpage.FIRST_NAME),
                theValue("Martinez").into(Registerpage.LAST_NAME),
                theValue("Calle 123").into(Registerpage.ADDRESS),
                theValue("Bogotá").into(Registerpage.STATE),
                theValue("Bogotá").into(Registerpage.CITY),
                theValue("110111").into(Registerpage.ZIPCODE),
                theValue("3001234567").into(Registerpage.MOBILE),
                on(Registerpage.CREATE_ACCOUNT),
                on(Registerpage.CONTINUE_BUTTON)
        );
    }
}

