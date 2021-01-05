package pl.rafalhrubesz;

import java.util.Scanner;

public class Keyboard {

    private static final String colour = "black";
    private static final String model = " tracer";

    public String getColor() {
        return colour;
    }
    public String getModel() {
        return model;
    }

    public void typing(){
        Scanner scanner = new Scanner(System.in);
        String userTypo = scanner.nextLine();
        System.out.println(userTypo);
        scanner.close();

    }
}
