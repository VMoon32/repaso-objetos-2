package uaslp.objetos.figuras;

public class Triangulo implements Figura, DrawableItem{
    private double base;
    private double altura;
    private double area;
    private String name = "Triangulo";
    private String description = "Cualquier triangulo";

    public Triangulo(double base, double altura){
        if(base == 0){
            throw new BaseNoProvistaException();
        }
        if(altura == 0){
            throw new AlturaNoProvistaException();
        }
        this.base = base;
        this.altura = altura;
    }
    public Triangulo(){

    }

    public void setBase(double base){
        if(base == 0){
            throw new BaseNoProvistaException();
        }

        this.base = base;
    }

    public void setAltura(double altura){
        if(altura == 0){
            throw new AlturaNoProvistaException();
        }

        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public double getArea(){
        if(base == 0){
            throw new BaseNoProvistaException();
        }
        if(altura == 0){
            throw new AlturaNoProvistaException();
        }

        area = base * altura / 2;

        return area;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}
