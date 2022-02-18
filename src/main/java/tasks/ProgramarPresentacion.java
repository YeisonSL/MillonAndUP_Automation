package tasks;

import interactions.DarClic;
import interactions.EsperarPor;
import interactions.SeleccionarFecha;
import models.InformacionProgramacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.ProgramaPresentacion;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomeMillonAndUp.BTN_PROGRAMAR_PRESENTACION;
import static userinterfaces.ProgramaPresentacion.BTN_AGENDAR;
import static userinterfaces.ProgramaPresentacion.BTN_VIDEO_LLAMADA;
import static userinterfaces.ProgramaPresentacion.TEXT_CORREO;
import static userinterfaces.ProgramaPresentacion.TEXT_NOMBRE;
import static userinterfaces.ProgramaPresentacion.TEXT_TELEFONO;

public class ProgramarPresentacion implements Task {

    private InformacionProgramacion infoProgramacion;

    public ProgramarPresentacion(InformacionProgramacion infoProgramacion) {
        this.infoProgramacion = infoProgramacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_PROGRAMAR_PRESENTACION));
        actor.attemptsTo(EsperarPor.segundos(1));
        actor.attemptsTo(Scroll.to(BTN_PROGRAMAR_PRESENTACION));
        actor.attemptsTo(EsperarPor.segundos(1));
        actor.attemptsTo(DarClic.enElemento(BTN_PROGRAMAR_PRESENTACION));
        actor.attemptsTo(SeleccionarFecha.presentacion());
        actor.attemptsTo(DarClic.enElemento(ProgramaPresentacion.OPC_HORA(infoProgramacion.getHora())));
        actor.attemptsTo(DarClic.enElemento(BTN_VIDEO_LLAMADA));
        actor.attemptsTo(Enter.theValue(infoProgramacion.getCorreo()).into(TEXT_CORREO));
        actor.attemptsTo(DarClic.enElemento(BTN_AGENDAR));
        actor.attemptsTo(Enter.theValue(infoProgramacion.getNombre()).into(TEXT_NOMBRE));
        actor.attemptsTo(Enter.theValue(infoProgramacion.getTelefono()).into(TEXT_TELEFONO));
        actor.attemptsTo(EsperarPor.segundos(1));
        actor.attemptsTo(DarClic.enElemento(BTN_AGENDAR));
    }

    public static ProgramarPresentacion conLosDatos(InformacionProgramacion infoProgramacion) {
        return instrumented(ProgramarPresentacion.class, infoProgramacion);
    }

}