package pl.rafalhrubesz;

public class Speakers {

    private static final String colour = "black";
    private static final String model = "CREATIVE";

    private boolean turnOn = false;
    private int currentVolume = 20;

    public void turnOn(){
        turnOn = true;
        System.out.println("Speakers are ON.");
    }

    public void turnOff(){
        turnOn = false;
        System.out.println("Speakers are OFF.");
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        currentVolume = volume;
    }
}
