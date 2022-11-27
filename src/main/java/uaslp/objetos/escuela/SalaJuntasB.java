package uaslp.objetos.escuela;

public class SalaJuntasB implements SalaDeJuntas{
    private static SalaJuntasB instance = new SalaJuntasB();
    public static SalaJuntasB getInstance(){

        return instance;
    }
    @Override
    public String getNombre() {
        return "Sala B";
    }
}
