
package com.mycompany.threading1;


class YellowLightThread extends Thread{
    @Override
    public void run(){
        try{
            while(true){
                System.out.println("Yellow Light");
                Thread.sleep(2000);  //2 seconds
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
