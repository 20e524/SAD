package elements;

import command.Command;
import command.FlipperElement;
import mediator.Mediator;

public class Target implements FlipperElement {


    Mediator mediator;
    Command command;

    public Target(Mediator mediator) {
        this.mediator = mediator;
    }

    private Boolean active = false;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void activate() {
        this.active = true;

    }

    @Override
    public void hit() {
        mediator.mediate(this);
        command.execute(); //callback
    }
}
