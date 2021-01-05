package pl.rafalhrubesz;

public class Lamp {

    private static final String colour = "white";
    private static boolean turnOn = false;


    public void setOn(){
        turnOn = true;
        System.out.println("desk lamp is ON.");
    }

    public void setOff(){
        turnOn = false;
        System.out.println("desk lamp is OFF.");
    }


}
