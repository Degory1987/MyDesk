package pl.rafalhrubesz;

public class Monitor implements DevicesInterface {

    private static final String colour = "black";
    private static final int size = 21;
    private boolean turnOn = false;

    public static String getColour() {
        return colour;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public String getColor() {
        return colour;
    }

    public int getSize() {
        return size;
    }
    public void setOn(){
        turnOn = true;
        System.out.println("Monitor is ON.");
    }

    public void setOff(){
        turnOn = false;
        System.out.println("Monitor is OFF.");
    }

    @Override
    public void turnOn() {
        System.out.println("Monitor is turn ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Monitor is turn OFF.");
    }
}
