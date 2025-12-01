package joshsatrionachemya.uas.ppbo25.models;

public class Fedora extends Linux {
    private String version;
    private String desktopEnvironmentName;

    public Fedora(String version) {
        super(version);
    }

    public Fedora(String version, String desktopEnvironmentName) {
        super(version, desktopEnvironmentName);
    }

    @Override
    void defaultDesktopEnvironment() {
        this.desktopEnvironmentName = "KDE Plasma";
    }

}
