package com.delete.acount.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteAccount implements Task {

    private static final Target DELETE_ACCOUNT_BUTTON = Target.the("delete account button")
            .locatedBy("//a[contains(text(),'Delete Account')]");

    public static DeleteAccount now() {
        return instrumented(DeleteAccount.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DELETE_ACCOUNT_BUTTON, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(DELETE_ACCOUNT_BUTTON)
        );
    }
}
