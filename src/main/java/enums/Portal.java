package enums;

public enum Portal {

    MILLON_AND_UP("https://newdesign.millionandup.com/");

    String portal;

    private Portal(String url) {
        this.portal = url;
    }

    public String getPortal() {
        return portal;
    }
}
