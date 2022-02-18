package questions;

import enums.Llave;
import enums.MensajeConfirmacion;
import exceptions.ExcepcionGeneral;
import interactions.EsperarElemento;
import models.InformacionProgramacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.ProgramaPresentacion.LBL_MENSAJE_CONFIRMACION;

public class ValidarProgramacion implements Question<Boolean> {

    private List<InformacionProgramacion> producto = theActorInTheSpotlight().recall(Llave.LLAVE.getLlave());

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(EsperarElemento.visibility(LBL_MENSAJE_CONFIRMACION, 3));
        try {
          LBL_MENSAJE_CONFIRMACION.resolveFor(actor).getText().equals(MensajeConfirmacion.MENSAJE_CONFIRMACION);
            return true;
        } catch (ExcepcionGeneral ex) {
            return false;
        }
    }

    public static ValidarProgramacion exitosa() {
        return new ValidarProgramacion();
    }
}