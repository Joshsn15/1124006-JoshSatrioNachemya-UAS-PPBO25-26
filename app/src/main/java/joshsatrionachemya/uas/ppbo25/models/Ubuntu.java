package joshsatrionachemya.uas.ppbo25.models;

public class Ubuntu extends Linux {
    private String version;
    private String desktopEnvironmentName;

    public Ubuntu(String version) {
        super(version);
    }

    public Ubuntu(String version, String desktopEnvironmentName) {
        super(version, desktopEnvironmentName);
    }

    @Override
    void defaultDesktopEnvironment() {
        this.desktopEnvironmentName = "Gnome";
    }

}
