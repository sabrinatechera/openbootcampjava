package ejercicio2;

public class PrecioIva {
    public static void main(String[] args) {

// Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

        System.out.println(" el precio con iva es de "+ precioIva(100));



               }
    public static double precioIva(double precio) {
        double iva=0.21;
        return precio*(1+iva);
    }

}
