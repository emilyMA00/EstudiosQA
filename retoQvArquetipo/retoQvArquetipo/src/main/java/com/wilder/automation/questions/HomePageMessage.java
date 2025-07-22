package com.wilder.automation.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageMessage {
    private static final Target TITULO = Target.the("título de productos")
            .located(By.className("title"));

    public static Question<String> valor() {
        return Text.of(TITULO).asString();
    }
}
