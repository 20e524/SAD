package elements;

import command.Command;
import command.FlipperElement;
import flipper.Flipper;

public class SlingShot implements FlipperElement {

    Flipper flipper;
    private boolean isActive = false;

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }


    public SlingShot(Flipper flipper) {
        this.flipper = flipper;
    }

    public Flipper getFlipper() {
        return flipper;
    }

    public void setFlipper(Flipper flipper) {
        this.flipper = flipper;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }



        public void shoot() {
        System.out.println("Slingshot shot.");
    }

    @Override
    public void hit() {
        System.out.println("slingshot hit implementation running");
        command.execute(); //callback
    }


}
