package ejercicio1;

public class Coche {
    public static void main(String[] args) {

        Coche objcoche=new Coche(86,1000,1000000,true,"Honda civic");

        System.out.println(objcoche);

        System.out.println(objcoche.año);
        System.out.println(objcoche.marca);

    }


    private int año;
    private long precio;
    private double km;
    private boolean aireAcon;
    private String marca;

    public Coche() {
    }

    public Coche(int año, long precio, double km, boolean aireAcon, String marca) {
        this.año = año;
        this.precio = precio;
        this.km = km;
        this.aireAcon = aireAcon;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "año=" + año +
                ", precio=" + precio +
                ", km=" + km +
                ", aireAcon=" + aireAcon +
                ", marca='" + marca + '\'' +
                '}';
    }
}
