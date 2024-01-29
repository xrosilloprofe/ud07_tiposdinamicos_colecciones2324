package interfaces;

public class Rectangulo implements IFigura,Relatable{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.altura=altura;
        this.base=base;
    }

    @Override
    public Double area(){return base*altura;}

    @Override
    public Double perimetro(){return 2*(base+altura);}

    @Override
    public boolean isLargerThan(Relatable relatable){
        if(!(relatable instanceof Rectangulo))
            return false;
        Rectangulo rectangulo = (Rectangulo) relatable;
        return area()>=rectangulo.area();
    }

}
