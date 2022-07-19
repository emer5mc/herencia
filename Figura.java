public class Figura
{
    private double x, y;

    public Figura(double x, double y){
        this.x=x;
        this.y=y;   
    }

    public double getx(){
         return x;
    }
    public double gety(){
         return y;
    }

    public double area(){
        Bidimensional d= Bidimensional(x,y);
        d.getArea();
    }
}