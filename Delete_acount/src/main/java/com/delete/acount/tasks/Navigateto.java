package com.delete.acount.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Open.url;

public class Navigateto implements Task {
    private final String appUrl;

    public Navigateto(String appUrl) {
        this.appUrl = appUrl;
    }

    public static Navigateto theAutomationExerciseHomePage() {
        return instrumented(Navigateto.class, "https://automationexercise.com");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(url(appUrl));
    }
}
