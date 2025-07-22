package com.login.example.tasks;

import com.login.example.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Enter.theValue;
import com.login.example.ui.Homepage;
import com.login.example.ui.Loginpage;

public class Login implements Task {
    private final User user;

    public Login(User user) {
        this.user = user;
    }

    public static Login with(User user) {
        return instrumented(Login.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(Homepage.SIGNUP_LOGIN),
                theValue(user.email).into(Loginpage.EMAIL_LOGIN_INPUT),
                theValue(user.password).into(Loginpage.PASSWORD_LOGIN_INPUT),
                on(Loginpage.LOGIN_BUTTON)
        );
    }
}