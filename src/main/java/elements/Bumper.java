package elements;

import command.Command;
import command.FlipperElement;
import mediator.Mediator;

public class Bumper implements FlipperElement {

    Mediator mediator;

    public Bumper(Mediator mediator) {
        this.mediator = mediator;
    }


    private Boolean active = false;

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void activate() {
        this.active = true;

    }

    public void bump() {
        System.out.println("bumper bumped");
    }

    @Override
    public void hit() {
        mediator.mediate(this);
        command.execute(); //callback
    }


}
