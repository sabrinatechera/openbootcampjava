package ejercicio4;

public class MainDevice {


    public static void main(String[] args) {

        SmartDevices objSmartphone = new Smartphone(true,"motorola", 128,20000,true);
        SmartDevices objSmarwatch = new Smartwatch(true,"iphone", 32,34000,"rojo");

        System.out.println(" las caracteristicas del smartphone son " + objSmartphone);
        System.out.println(" las caracteristicas del smartphone son "+ objSmarwatch);
    }


}
