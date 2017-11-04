
package oop;


public class Triangle extends Figure{
    private double s1;
    private double s2;
    private double s3;
    private double p = super.getP();
    private double area=Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
    double getArea(){
        return area;
    }
    Triangle(double rgb,double perimetr, double s1, double s2, double s3){
        super(rgb,perimetr);
        
        System.out.println("\nFigure->Triangle was created!");
        
    }
    
    protected void info(){
        System.out.println("\nTriangle object:");
        System.out.println("Area= "+ this.area);
        System.out.println("RGB = "+ super.getRGB());
        System.out.println("Perimetr = "+ super.getP());
    }
    
}
