
package com.mycompany.threading1;


 class RedLightThread extends Thread{
    @Override
    public void run(){
        try{
            while(true){
                System.out.println("Red Light");
                Thread.sleep(5000);   //5 seconds
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
}
}