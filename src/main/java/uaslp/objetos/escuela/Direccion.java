package uaslp.objetos.escuela;

public class Direccion {
    private static Direccion instance = new Direccion();

    public static Direccion getInstance(){

        return instance;
    }
    private Direccion(){

    }

}
