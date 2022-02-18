package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProgramaPresentacion {

    private ProgramaPresentacion() {

    }

    public static final Target BTN_DESPLEGAR_CALENDARIO = Target.the("Boton abrir el calendario de programacion")
            .located(By.cssSelector(".txt-schedule"));

    public static final Target BTN_CAMBIAR_MES = Target.the("Boton para cambiar el mes del calendario")
            .located(By.cssSelector(".fc-icon-chevron-right"));

    public static final Target OPC_DIA(String valorOpcion) {
        return Target.the("Opcion día en el calendario")
                .located(By.xpath("//*[@data-date='"+valorOpcion+"']"));
    }


    public static final Target OPC_HORA(String valorOpcion) {
        return Target.the("Opcion día en el calendario")
                .located(By.xpath("//li[.='"+valorOpcion+"3 PM']"));
    }

    public static final Target BTN_VIDEO_LLAMADA = Target.the("Boton para selccionar la opcion videollamada")
            .located(By.xpath("//span[contains(.,'Llamada en Zoom')]"));

    public static final Target TEXT_CORREO = Target.the("Campo para ingresar el correo")
            .located(By.xpath("//*[@id='frmScheduleLeadModal']//descendant::input[@id='email']"));

    public static final Target BTN_AGENDAR = Target.the("Boton para enviar la fecha y el correo")
            .located(By.id("btnSendModal"));

    public static final Target TEXT_NOMBRE = Target.the("Campo para ingresar nombre del usuario")
            .located(By.xpath("//*[@id='frmScheduleLeadModal']//descendant::input[@id='name']"));

    public static final Target TEXT_TELEFONO = Target.the("Campo para ingresar el telefono")
            .located(By.xpath("//*[@id='frmScheduleLeadModal']//descendant::input[@id='phone']"));

    public static final Target LBL_MENSAJE_CONFIRMACION = Target.the("Texto de confirmacion que se muestra cuando se realiza una programacion")
            .located(By.cssSelector(".schedule-response-text"));


}
