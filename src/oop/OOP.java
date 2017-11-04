
package oop;

/**
 *
 * @author snow28
 */
public class OOP {

    public static void main(String[] args) {
        Circle circle = new Circle(2.2,2.2,5,10);
        circle.info();
        Rectangle rectangle = new Rectangle(123,25,5,5);
        rectangle.info();
        Square square = new Square(123,25,5);
        square.info();
        Triangle triangle = new Triangle(125233435,25,10,10,5);
        triangle.info();
        Equilateral equilateral = new Equilateral(233433244,15,5);
        equilateral.info();
    }
    
}
