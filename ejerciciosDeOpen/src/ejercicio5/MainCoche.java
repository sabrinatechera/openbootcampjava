package ejercicio5;

public class MainCoche {
    public static void main(String[] args) {

      CocheCRUDImpl objCoche = new CocheCRUDImpl();

      objCoche.save();
      objCoche.delete();
      objCoche.findAll();
    }
}
