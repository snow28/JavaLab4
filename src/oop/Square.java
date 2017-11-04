/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author snow28
 */
public class Square extends Rectangle{
    private double side;
    
    Square(double rgb,double perimetr,double S){
        super(rgb,perimetr,0.0,0.0);
        this.side=S;
        System.out.println("Figure->Rectangle->Square was created!");
    }
    
    public void info(){
        System.out.println("\nRectangle object:");
        System.out.println("Area= "+ side*side);
        System.out.println("RGB = "+ super.getRGB());
        System.out.println("Perimetr = "+ side*4);
        System.out.println("Side = " + this.side );
    }
    
}
