package elements;

import command.Command;
import command.FlipperElement;

public class SlingShot implements FlipperElement {

    public void shoot() {
        System.out.println("Slingshot shot.");
    }

    @Override
    public void hit() {
        System.out.println("slingshot hit implementation running");
    }

    @Override
    public void setCommand(Command command) {

    }


}
