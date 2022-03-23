package elements;

import command.Command;
import command.FlipperElement;

public class Bumper implements FlipperElement {

    private String identifier;
    private Boolean active = false;

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public Bumper(String identifier) {
        this.identifier = identifier;
    }

    public void activate() {
        this.active = true;
        System.out.println("bumper " + identifier + " activated");
    }

    public void bump() {
        System.out.println("bumper " + identifier + " bumped");
    }

    @Override
    public void hit() {
        command.execute(); //callback
    }


}
