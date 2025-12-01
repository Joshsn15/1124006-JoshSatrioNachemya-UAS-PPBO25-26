package joshsatrionachemya.uas.ppbo25.models;

public abstract class Linux extends OperatingSystem {
    private String name;
    private String version;
    private String desktopEnvironmentName;

    public Linux(String version) {
        super("Linux", version);
    }

    public Linux(String version, String desktopEnvironmentName) {
        super("Linux", version);
        this.desktopEnvironmentName = desktopEnvironmentName;
    }

    String getVersion() {
        return this.version;
    }

    String getDesktopEnvironmentName() {
        return this.desktopEnvironmentName;
    }

    abstract void defaultDesktopEnvironment();

    @Override
    void getBootInfo() {
        System.out.println("Name:" + name);
        System.out.println("version:" + version);
        System.out.println("desktopEnvironmentName:" + desktopEnvironmentName);
    }

}
