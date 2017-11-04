package oop;


public class Circle extends Figure{
    private double radius;
    private double diametr;
    Circle(double rgb,double perimetr,double r , double d){
        super(rgb,perimetr);
        radius=r;
        diametr=d;
        System.out.println("Figure->Circle was created!");
    }
    
    public void info(){
        System.out.println("\nCircle object:");
        System.out.println("RGB = "+ super.getRGB());
        System.out.println("Perimetr = "+ super.getP());
        System.out.println("Radius = "+ this.radius);
        System.out.println("Diametr = "+ this.diametr + "\n");
    }
    
}
