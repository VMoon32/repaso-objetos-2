package uaslp.objetos.escuela;

public class SalaJuntasA implements SalaDeJuntas{

    private static SalaJuntasA instance = new SalaJuntasA();

    @Override
    public String getNombre() {
        return "Sala A";
    }

    public static SalaJuntasA getInstance(){

        return instance;
    }
}
