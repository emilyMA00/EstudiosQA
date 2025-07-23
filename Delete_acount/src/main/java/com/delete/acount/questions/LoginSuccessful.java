package com.delete.acount.questions;

import com.delete.acount.userinterfaces.Homepage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginSuccessful {
    public static Question<Boolean> displayed() {

        return actor -> Homepage.LOGGED_IN_AS.resolveFor(actor).isVisible();
    }

    public static Question<String> displayedMessage() {
        return Text.of(Homepage.ACCOUNT_DELETED_MESSAGE).asString();
    }
}
