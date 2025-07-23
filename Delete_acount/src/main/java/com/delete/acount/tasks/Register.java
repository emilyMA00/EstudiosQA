package com.delete.acount.tasks;


import com.delete.acount.userinterfaces.Homepage;
import com.delete.acount.userinterfaces.Loginpage;
import com.delete.acount.userinterfaces.Registerpage;
import com.delete.acount.utils.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static net.serenitybdd.screenplay.actions.Click.on;

public class Register implements Task {

    private final String email;
    private final String password = TestData.registeredPassword;
    private final Random random = new Random();

    public Register() {
        this.email = "prueba" + random.nextInt(100) + "@gmail.com";
        TestData.registeredEmail = this.email; // Guarda el email generado para usar en Login
    }

    // ✅ Método de fábrica necesario
    public static Register task() {
        return instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(Homepage.SIGNUP_LOGIN),
                theValue("Juan").into(Loginpage.NAME_INPUT),
                theValue(email).into(Loginpage.EMAIL_SIGNUP_INPUT),
                on(Loginpage.SIGNUP_BUTTON),

                theValue(password).into(Registerpage.PASSWORD),
                theValue("Emily").into(Registerpage.FIRST_NAME),
                theValue("Martinez").into(Registerpage.LAST_NAME),
                theValue("Calle 123").into(Registerpage.ADDRESS),
                theValue("Bogotá").into(Registerpage.STATE),
                theValue("Bogotá").into(Registerpage.CITY),
                theValue("110111").into(Registerpage.ZIPCODE),
                theValue("3001234567").into(Registerpage.MOBILE),
                on(Registerpage.CREATE_ACCOUNT),
                on(Registerpage.CONTINUE_BUTTON)
        );
    }
}

