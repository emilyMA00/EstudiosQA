package com.login.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import com.login.example.ui.Homepage;

public class LoginSuccessful {
    public static Question<Boolean> displayed() {
        return actor -> Homepage.LOGGED_IN_AS.resolveFor(actor).isVisible();
    }
}
