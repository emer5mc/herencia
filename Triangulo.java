public class Triangulo extends Bidimensional
{

    public Triangulo(double x, double y){
        super(x,y);
    }

    @Override
    public double getArea(){
        return (getx()*gety()) /2; 
    }


}