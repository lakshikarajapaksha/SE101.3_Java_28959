
package com.mycompany.lab06q2;

public class Rectangle implements Shape{
    private double length;
    private double width;
     
    //constructor
    public Rectangle (double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    
    //Setter
    public void setLength(double length)
    {
        this.length=length;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    
    //getter
    
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    
    @Override
    public double calculateArea()
    {
        return  length*width;
    }
    
    @Override
    public double calculatePerimeter()
    {
        return  2*(length + width);
    }
    
}
