
package com.mycompany.shapemain;


public class Shapemain {

    public static void main(String[] args) {
        Circle c=new Circle(7.0);
        double circleArea=c.calculateArea();
        c.display();
        System.out.println("Circle area is: "+c.calculateArea());
        
        Rectangle r=new Rectangle(5.0,5.0);
        double rectangleArea=r.calculateArea();
        r.display();
        System.out.println("Reactangle area is: "+r.calculateArea());
    }
}
