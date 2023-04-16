package ejercicio4;

public class Smartwatch extends SmartDevices {

    private String color;

    public Smartwatch() {
    }

    public Smartwatch(boolean internet, String marca, int memoriainterna, int precio, String color) {
        super(internet, marca, memoriainterna, precio);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Smartwatch{" +
                "color='" + color + '\'' +
                '}'+ super.toString() ;
    }
}
