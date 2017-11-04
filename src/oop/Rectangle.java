
package oop;


public class Rectangle extends Figure{
    private final double width;
    private final double height;
    private final double area;
    
    double getArea(){
        return area;
    }
    Rectangle(double rgb,double perimetr,double W , double H){
        super(rgb,perimetr);
        width=W;
        height=H;
        System.out.println("Figure->Rectangle was created!");
        this.area=this.width*this.height;
    }
    
    protected void info(){
        System.out.println("\nRectangle object:");
        System.out.println("Area= "+ this.area);
        System.out.println("RGB = "+ super.getRGB());
        System.out.println("Perimetr = "+ super.getP());
        System.out.println("Width = "+ this.width);
        System.out.println("Height = "+ this.height + "\n");
    }
    
}
