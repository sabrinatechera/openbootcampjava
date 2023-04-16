package ejercicio5;

public class CocheCRUDImpl implements ICocheCrud {



    @Override
    public void save() {
        System.out.println("esto guarda un coche");
    }

    @Override
    public void findAll() {
        System.out.println("esto busca todo los coches");
    }

    @Override
    public void delete() {
        System.out.println("esto elimina un coche");
    }
}
