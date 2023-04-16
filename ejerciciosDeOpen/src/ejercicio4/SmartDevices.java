package ejercicio4;

public abstract class SmartDevices {

  private  boolean internet;
        private String marca;
    private int memoriainterna;
    private int precio;

    public SmartDevices() {
    }

    public SmartDevices(boolean internet, String marca, int memoriainterna, int precio) {
        this.internet = internet;

        this.marca = marca;
        this.memoriainterna = memoriainterna;
        this.precio = precio;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriainterna() {
        return memoriainterna;
    }

    public void setMemoriainterna(int memoriainterna) {
        this.memoriainterna = memoriainterna;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return
                "internet=" + internet +
                ", marca='" + marca + '\'' +
                ", memoriainterna=" + memoriainterna +
                ", precio=" + precio +
                '}';
    }
}
