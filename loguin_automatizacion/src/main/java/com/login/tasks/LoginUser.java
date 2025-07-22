package com.login.tasks;

import com.login.models.UserData;
import com.login.ui.AutomationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUser implements Task {
    private final UserData user;

    public LoginUser(UserData user) {
        this.user = user;
    }

    public static LoginUser with(UserData user) {
        return instrumented(LoginUser.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AutomationPage.LOGIN_LINK),
                Enter.theValue(user.email()).into(AutomationPage.LOGIN_EMAIL),
                Enter.theValue(user.password()).into(AutomationPage.LOGIN_PASSWORD),
                Click.on(AutomationPage.LOGIN_BUTTON)
        );
    }
}
