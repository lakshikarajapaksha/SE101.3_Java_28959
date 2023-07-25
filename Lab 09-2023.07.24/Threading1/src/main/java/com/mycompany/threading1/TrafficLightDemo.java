
package com.mycompany.threading1;

/**
 *
 * @author user
 */
enum TrafficLightColor{
    RED,GREEN,YELLOW
}
//A computerized traffic light
class TrafficLightSimulator implements Runnable {
    private Thread thrd; //holds the threads that runs the simulation
    private TrafficLightColor tlc;  //holds the current traffic light color
    boolean stop=false;  //set to true to stop the simulation
    
    TrafficLightSimulator (TrafficLightColor init){
        tlc=init;
        
        thrd=new Thread(this);
        thrd.start();
    }
    
    TrafficLightSimulator(){
        tlc=TrafficLightColor.RED;
        
        thrd=new Thread(this);
        thrd.start();
    }
    
    //start up the light
    public void run(){
        while(!stop){
            try{
                switch(tlc){
                    case GREEN:
                        System.out.println("Green Light");
                        Thread.sleep(10000);  //green for 10 seconds
                        break;
                    case YELLOW:
                        System.out.println("Yellow Light");
                        Thread.sleep(2000);  //yellow for 2 seconds
                        break;
                        
                    case RED:
                        System.out.println("Red Light");
                        Thread.sleep(5000);  //red for 5 seconds
                        break;
                }
                
            }catch(InterruptedException  exc){
                System.out.println(exc);
            }
            changeColor();
        }
    }
    
    //Change color.
    synchronized void changeColor(){
        switch(tlc){
            case RED:
                tlc=TrafficLightColor.GREEN;
                break;
            
                case YELLOW:
                tlc=TrafficLightColor.RED;
                break;
                
                case GREEN:
                tlc=TrafficLightColor.YELLOW;
                
                
        }
        notify();  //signal that the light has changed 
    }
    
    //Wait until a light change occurs.
    synchronized void waitForChange(){
        try{
            wait();  //wait for light to change
        }catch(InterruptedException exc){
            System.out.println(exc);
        }
    }
    
    //Return current color
    TrafficLightColor getColor(){
        return tlc;
    }
    
    //stop  the traffic light.
    void cancel(){
        stop=true;
    }
    
}

public class TrafficLightDemo {
    public static void main(String[] args) {
        // TODO code application logic here
        TrafficLightSimulator t1=new TrafficLightSimulator(TrafficLightColor.RED);
        
        for(int i = 0; i < 9; i++){
          //  System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}
    
    

