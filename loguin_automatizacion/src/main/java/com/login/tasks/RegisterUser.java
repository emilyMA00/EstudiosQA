package com.login.tasks;

import com.login.models.UserData;
import com.login.ui.AutomationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import  net.serenitybdd.screenplay.Tasks.*;
import static net.serenitybdd.screenplay.actions.Click.*;
import static net.serenitybdd.screenplay.actions.Enter.*;
import static net.serenitybdd.screenplay.actions.Open.*;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUser implements Task {
    private final UserData user;

    public RegisterUser(UserData user) {
        this.user = user;
    }

    public static RegisterUser with(UserData user) {
        return instrumented(RegisterUser.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AutomationPage.LOGIN_LINK),
                Enter.theValue(user.name()).into(AutomationPage.NAME_INPUT),
                Enter.theValue(user.email()).into(AutomationPage.EMAIL_INPUT),
                Click.on(AutomationPage.SIGNUP_BUTTON),
                Enter.theValue(user.password()).into(AutomationPage.PASSWORD_INPUT),
                Click.on(AutomationPage.CREATE_BUTTON)
        );
    }
}
