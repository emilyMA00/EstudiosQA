package com.login.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;
import com.login.example.ui.Homepage;

public class Logout implements Task {
    public static Logout fromApp() {
        return instrumented(Logout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(on(Homepage.LOGOUT));
    }
}
