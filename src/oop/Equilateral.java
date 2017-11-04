
package oop;


public class Equilateral extends Triangle{
    private double side;
    private double p = super.getP();
    private double area=Math.sqrt(p*(p-side)*(p-side)*(p-side));
    double getArea(){
        return area;
    }
    Equilateral(double rgb,double perimetr,double Side){
        super(rgb,perimetr,0,0,0);
        this.side=Side;
        System.out.println("\nFigure->Equilateral Triangle was created!");
        
    }
    
    protected void info(){
        System.out.println("\nEquilateral Triangle object:");
        System.out.println("Area= "+ this.area);
        System.out.println("RGB = "+ super.getRGB());
        System.out.println("Perimetr = "+ super.getP());
    }
    
}
