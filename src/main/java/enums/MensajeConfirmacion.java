package enums;

public enum MensajeConfirmacion {

    MENSAJE_CONFIRMACION("Su presentación del proyecto se programó con éxito. Uno de nuestros agentes se contactará en breve para brindarle detalles.");

    String mensaje;

    private MensajeConfirmacion(String mesaje) {
        this.mensaje = mesaje;
    }

    public String getMensajeConfirmacion() {
        return mensaje;
    }
}
