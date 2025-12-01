package joshsatrionachemya.uas.ppbo25.models;

public class Windows extends OperatingSystem {
    String name;
    String version;

    public Windows( String version) {
        super("Windows", version);
    }

    @Override
    void getBootInfo() {
        System.out.println("Name:" + name);
        System.out.println("version:" + version);
    }  
}
