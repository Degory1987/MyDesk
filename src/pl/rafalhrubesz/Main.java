package pl.rafalhrubesz;


import java.util.List;

public class Main {

    public static void main(String[] args) {
      
        System.out.print("All devices: ");
        final List<String> list = List.of("monitor, keyboard, speakers, desk lamp.");
        System.out.println(list);

        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Speakers speakers = new Speakers();
        Lamp deskLamp = new Lamp();

        deskLamp.turnOn();
        deskLamp.turnOff();

        monitor.turnOn();
        monitor.turnOff();

        speakers.turnOn();
        System.out.println("Current volume is " + speakers.getCurrentVolume());
        speakers.setCurrentVolume(50);
        System.out.println("Set volume on " + speakers.getCurrentVolume());

        speakers.turnOff();

        System.out.println("Monitor's size is " + monitor.getSize() + " inches");
        System.out.println("Keyboard:" + keyboard.getModel() + " and colour " + keyboard.getColor());

        keyboard.typing();
    }
}
