package stepdefinitions;

import enums.Llave;
import enums.Portal;
import io.cucumber.java.es.Entonces;
import models.InformacionProgramacion;
import questions.ValidarProgramacion;
import tasks.ProgramarPresentacion;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static utilities.Constantes.USUARIO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProgramarPresentacionSteps {

    @DataTableType
    public InformacionProgramacion presentacionEntry(Map<String, String> entry) {
        return new InformacionProgramacion(
                entry.get("hora"),
                entry.get("correo"),
                entry.get("nombre"),
                entry.get("telefono")
        );

    }

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("el usuario ingresa al portal de millon and up")
    public void queElClienteIngresaAlPortalDeMillonAndUp() {
        theActor(USUARIO).wasAbleTo(Open.url(Portal.MILLON_AND_UP.getPortal()));
    }

    @Cuando("el usuario diligencia la informacion para programar una presentacion de proyecto")
    public void elClienteProgramaSuPresentacion(List<InformacionProgramacion> infoProgramacion) {
        theActorInTheSpotlight().remember(Llave.LLAVE.getLlave(), infoProgramacion);
        theActorInTheSpotlight().attemptsTo(ProgramarPresentacion.conLosDatos(infoProgramacion.get(0)));

    }

    @Entonces("el cliente podra visualizar los datos de la presetnacion agendada")
    public void elClientePodraVisualizarLosDatosDeLaProgramacion() {;
       theActorInTheSpotlight().should(seeThat(ValidarProgramacion.exitosa(), equalTo(true)));
    }
}
