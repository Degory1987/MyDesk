package pl.rafalhrubesz;

public class Lamp implements DevicesInterface {

    private static final String colour = "white";

    @Override
    public void turnOn() {
        System.out.println("Lamp is now turn ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Lamp is now turn OFF.");
    }
}
