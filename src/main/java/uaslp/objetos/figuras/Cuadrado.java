package uaslp.objetos.figuras;

public class Cuadrado implements Figura, DrawableItem{
    private double lado;
    private double area;
    private String name = "Cuadrado";

    public Cuadrado(double lado){
        if(lado == 0){
            throw new LadoNoProvistoException();
        }
        this.lado = lado;
    }

    public Cuadrado(){

    }

    public void setLado(double lado){
        if(lado == 0){
            throw new LadoNoProvistoException();
        }
        this.lado = lado;
    }

    public double getArea(){
        if(lado == 0){
            throw new LadoNoProvistoException();
        }
        area = lado * lado;

        return area;
    }

    public double getLado(){
        return lado;
    }

    @Override
    public String getName() {
        return name;
    }
}
