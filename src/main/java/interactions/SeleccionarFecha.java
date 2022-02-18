package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.DoubleClick;
import userinterfaces.ProgramaPresentacion;

import java.time.LocalDate;
import java.util.Date;

import static userinterfaces.ProgramaPresentacion.BTN_CAMBIAR_MES;
import static userinterfaces.ProgramaPresentacion.BTN_DESPLEGAR_CALENDARIO;


public class SeleccionarFecha implements Interaction {

    LocalDate localDate = LocalDate.now().plusMonths(2);
    Date date = java.sql.Date.valueOf(localDate);
    String fecha = date.toString();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(DarClic.enElemento(BTN_DESPLEGAR_CALENDARIO));
        actor.attemptsTo(DoubleClick.on(BTN_CAMBIAR_MES));
        actor.attemptsTo(DarClic.enElemento(ProgramaPresentacion.OPC_DIA(fecha)));
    }

    public static SeleccionarFecha presentacion() {
        return Tasks.instrumented(SeleccionarFecha.class);
    }

}
