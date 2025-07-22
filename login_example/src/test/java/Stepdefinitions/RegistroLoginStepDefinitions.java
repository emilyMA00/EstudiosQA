package Stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import com.login.example.models.User;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.login.example.questions.LoginSuccessful;
import com.login.example.tasks.Login;
import com.login.example.tasks.Logout;
import com.login.example.tasks.Navigateto;
import com.login.example.tasks.Register;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroLoginStepDefinitions {

    User user;

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que Emily abre la página de Automation Exercise")
    public void queEmilyAbreLaPagina() {
        OnStage.theActorCalled("Emily").wasAbleTo(Navigateto.theAutomationExerciseHomePage());
    }

    @Cuando("ella se registra con datos válidos")
    public void ellaSeRegistra() {
        user = User.withRandomData();
        OnStage.theActorInTheSpotlight().attemptsTo(Register.with(user));
    }

    @Cuando("cierra sesión")
    public void cierraSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Logout.fromApp());
    }

    @Cuando("inicia sesión con las mismas credenciales")
    public void iniciaSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.with(user));
    }

    @Entonces("debería ver que el login fue exitoso")
    public void verificaLogin() {
        OnStage.theActorInTheSpotlight().should(seeThat(LoginSuccessful.displayed()));
    }
}

