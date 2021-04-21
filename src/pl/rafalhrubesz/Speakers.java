package pl.rafalhrubesz;

public class Speakers implements DevicesInterface {

    private static final String colour = "black";
    private static final String model = "CREATIVE";

    private boolean turnOn = false;
    private int currentVolume = 20;

    @Override
    public void turnOn() {
        turnOn = true;
        System.out.println("Speakers are ON.");
    }


    @Override
    public void turnOff() {
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
