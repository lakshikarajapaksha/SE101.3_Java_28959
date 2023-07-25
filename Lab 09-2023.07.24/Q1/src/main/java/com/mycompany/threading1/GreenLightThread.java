
package com.mycompany.threading1;

class GreenLightThread extends Thread{
   @Override
    public void run(){
        try{
            while(true){
                System.out.println("Green Light");
                Thread.sleep(10000);  //10 seconds
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }

 
}
}