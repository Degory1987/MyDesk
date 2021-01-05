package pl.rafalhrubesz;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.print("All devices: ");
        final List<String> list = List.of("monitor, keyboard, speakers, desk lamp.");
        System.out.println(list);

        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Speakers speakers = new Speakers();
        Lamp deskLamp = new Lamp();

        // do zrobienia lista urzarzen : lista array list czy coskolwiek.

        deskLamp.setOn();
        deskLamp.setOff();

        monitor.setOn();
        monitor.setOff();

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
