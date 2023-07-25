
package com.mycompany.threading1;

public class Threading1 {

    public static void main(String[] args) {
        //TODO code applicationlogic here
        RedLightThread redLightThread = new RedLightThread();
        GreenLightThread greenLightThread = new GreenLightThread();
        YellowLightThread yellowLightThread = new YellowLightThread();
        
        redLightThread.start();
        greenLightThread.start();
        yellowLightThread.start();
    }
}
