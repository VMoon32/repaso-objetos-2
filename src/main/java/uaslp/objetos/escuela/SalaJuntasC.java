package uaslp.objetos.escuela;

public class SalaJuntasC implements SalaDeJuntas{
    private static SalaJuntasC instance = new SalaJuntasC();
    public static SalaJuntasC getInstance(){

        return instance;
    }
    @Override
    public String getNombre() {
        return "Sala C";
    }
}
