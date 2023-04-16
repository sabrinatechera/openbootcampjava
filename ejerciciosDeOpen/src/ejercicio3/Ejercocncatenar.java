package ejercicio3;

public class Ejercocncatenar {

    public static void main(String[] args) {

        String[] nombres = {"leo ", "sabri ", "naty ", "sofy "};

        for (int i = 0; i < nombres.length; i++) {

            String aux="";
            aux += nombres[i];
            System.out.print(nombres[i] + "|");
        }


    }

}



