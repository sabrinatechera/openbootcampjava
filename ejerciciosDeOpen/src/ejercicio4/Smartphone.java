package ejercicio4;

public class Smartphone extends SmartDevices {

    private boolean gps;

    public Smartphone() {
            }


    public Smartphone(boolean internet, String marca, int memoriainterna, int precio, boolean gps) {
        super(internet, marca, memoriainterna, precio);
        this.gps = gps;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "gps=" + gps +
                '}'+ super.toString();
    }
}
