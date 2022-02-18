package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeMillonAndUp {

    private HomeMillonAndUp() {
    }

    public static final Target BTN_PROGRAMAR_PRESENTACION = Target.the("Boton para ingresgar a programar una presentacion")
            .located(By.id("addressBtn"));

}
