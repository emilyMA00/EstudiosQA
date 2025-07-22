package runners;


import com.login.models.UserData;
import com.login.tasks.LoginUser;
import com.login.tasks.RegisterUser;
import com.login.ui.AutomationPage;
import net.serenitybdd.junit5.SerenityTest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

@SerenityTest
public class LoginAndRegisterTest {

    @Managed(driver = "chrome")
    WebDriver driver;

    Actor user = Actor.named("UsuarioQA");

    @BeforeEach
    public void setup() {
        user.can(BrowseTheWeb.with(driver));
        driver.get("https://automationexercise.com");
    }

    @Test
    public void registerAndLoginUser() {
        UserData userData = new UserData("TestQA", "test" + System.currentTimeMillis() + "@correo.com", "clave123");

        user.attemptsTo(RegisterUser.with(userData));
        // Aquí podrías hacer una verificación de creación exitosa

        user.attemptsTo(LoginUser.with(userData));
        user.should(
                seeThat("el texto de usuario logueado",
                        actor -> AutomationPage.LOGGED_IN_TEXT.resolveFor(actor).getText(),
                        containsString(userData.name()))
        );
    }
}
