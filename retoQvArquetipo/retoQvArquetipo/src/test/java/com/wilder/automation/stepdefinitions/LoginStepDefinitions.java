package com.wilder.automation.stepdefinitions;

import com.wilder.automation.interactions.OpenPage;
import com.wilder.automation.tasks.Buy;
import com.wilder.automation.tasks.Login;
import com.wilder.automation.questions.HomePageMessage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinitions {




    @Given("que Wilder accede a  bonite")
    public void queWilderAccedeABonite() {
        OnStage.theActorCalled("Wilder").wasAbleTo(OpenPage.from("https://www.bon-bonite.com/"));
    }

    @And("ingresa con credenciales validad")
    public void ingresaConCredencialesValidad() {
        Actor user = theActorInTheSpotlight();
        user.attemptsTo(Login.withCredentials("1152696923", "Agosto2022*"));
    }


    @When("realiza la compra de un bolso {string}")
    public void realizarCompra(String name) {
        Actor user = theActorInTheSpotlight();
     //   user.attemptsTo(Buy.makeBuy(name));
    }

    @Then("debería ver el nombre del bolso {string} en el carro de compras")
    public void verificarMensaje(String mensajeEsperado) {
        theActorInTheSpotlight().should(
                seeThat(HomePageMessage.valor(), equalTo(mensajeEsperado))
        );
    }


}