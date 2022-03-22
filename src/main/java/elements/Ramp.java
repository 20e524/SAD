package elements;

import command.Command;
import command.FlipperElement;

public class Ramp implements FlipperElement {

    public void raiseRamp() {
        System.out.println("Ramp raised!");
    }

    @Override
    public void hit() {
        System.out.println("ramp hit");
    }
}
