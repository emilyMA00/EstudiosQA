package com.wilder.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Tasks;

public class OpenPage implements Interaction {

    private final String url;

    public OpenPage(String url) {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

    public static OpenPage from(String url) {
        return Tasks.instrumented(OpenPage.class, url);
    }
}
