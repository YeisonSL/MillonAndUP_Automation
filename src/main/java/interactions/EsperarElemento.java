package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperarElemento implements Interaction {

    private int timpoEspera;
    private Target elemento;

    public EsperarElemento(Target elemento, int timpoEspera) {
        this.timpoEspera = timpoEspera;
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!(elemento.resolveFor(actor).isVisible())
                && timpoEspera > 0) {
            actor.attemptsTo(EsperarPor.segundos(3));
            timpoEspera = timpoEspera - 1;
        }

    }

    public static EsperarElemento visibility(Target elemento, int timpoEspera) {
        return instrumented(EsperarElemento.class, elemento, timpoEspera);
    }

}
