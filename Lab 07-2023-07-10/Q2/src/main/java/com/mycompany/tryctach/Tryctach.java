
package com.mycompany.tryctach;
import java.util.Scanner;
public class Tryctach {

    public static void main(String[] args) {
        int no1=10,no2=2,ans;
        
        //Array in java
        int arr[]=new int [5];
        
        try
        {
            ans=no1/no2;
            System.out.println("Answer is "+ans);
            arr[5]=25;
            System.out.println("Last element is "+arr[5]);
        }
        
        catch (ArithmeticException e)
                {
                    System.out.println("Number divide by zero error "); 
                }
        catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Array index error");
        
                }
        
        /*
        finally
        {
            System.out.println("Finally block is here");
        }*/
    }
}
