package uaslp.objetos.figuras;

public class TrianguloEquilatero extends Triangulo{
    private String name = "Triangulo Equilatero";
    private String description = "Lados iguales";

    public TrianguloEquilatero(){

    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }
}
