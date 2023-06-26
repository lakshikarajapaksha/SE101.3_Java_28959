
package com.mycompany.lab06q2;

public class Circle implements Shape{
    private double radius;
    
    //constructor
    public Circle(double radius)
    {
        this.radius=radius;
    }
    
    //Setter
     
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    
    //getter
    public double getRadius()
    {
        return radius;
    }
    
    @Override
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter()
    {
        return  2 * Math.PI * radius;
    }
    
}
