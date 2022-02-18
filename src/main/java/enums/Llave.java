package enums;

public enum Llave {

    LLAVE("Datos de la programacion");

    String llave;

    private Llave(String key) {
        this.llave = key;
    }

    public String getLlave() {
        return llave;
    }
}
