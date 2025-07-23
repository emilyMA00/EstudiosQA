package com.delete.acount.stepdefinitions;

import com.delete.acount.questions.LoginSuccessful;
import com.delete.acount.tasks.Login;
import com.delete.acount.tasks.Logout;
import com.delete.acount.tasks.Navigateto;
import com.delete.acount.tasks.Register;
import com.delete.acount.tasks.DeleteAccount;
import com.delete.acount.utils.TestData;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class RegistroLoginStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("el usuario abre la página de Automation Exercise")
    public void elusuarioAbreLaPagina() {
        OnStage.theActorCalled("usuario").wasAbleTo(Navigateto.theAutomationExerciseHomePage());
    }


    @When("el se registra con datos válidos")
    public void elSeRegistra() {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.task());
    }

    @When("cierra sesión")
    public void cierraSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Logout.fromApp());
    }

    @When("inicia sesión con las mismas credenciales")
    public void iniciaSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(TestData.registeredEmail, TestData.registeredPassword)
        );
    }

    @Entonces("debería ver que el login fue exitoso")
    public void verificaLogin() {
        OnStage.theActorInTheSpotlight().should(seeThat(LoginSuccessful.displayed()));
    }

    @When("elimina la cuenta")
    public void eliminaLaCuenta() {
        OnStage.theActorInTheSpotlight().attemptsTo(DeleteAccount.now());
    }

    @Entonces("debería ver el mensaje {string}")
    public void deberíaVerElMensaje(String mensajeEsperado) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("el mensaje mostrado", LoginSuccessful.displayedMessage(), containsString(mensajeEsperado))
        );
    }
}
