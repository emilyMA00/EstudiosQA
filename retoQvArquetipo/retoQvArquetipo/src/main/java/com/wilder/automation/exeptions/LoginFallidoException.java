package com.wilder.automation.exeptions;

public class LoginFallidoException extends AssertionError {

    public LoginFallidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public static LoginFallidoException conMensaje(String mensaje, Throwable causa) {
        return new LoginFallidoException(mensaje, causa);
    }
}

/*if (!LoginPage.BOTON_LOGIN.resolveFor(actor).isVisible()) {
    throw conMensaje("No se encontró el botón de login en pantalla", null);
}
-----------------------------------
import static com.wilder.automation.exceptions.LoginFallidoException.conMensaje;

...

theActorInTheSpotlight().should(
    seeThat(HomePageMessage.valor(), equalTo("Products"))
        .orComplainWith(LoginFallidoException.class, "El mensaje de bienvenida no es el esperado")
);
 */