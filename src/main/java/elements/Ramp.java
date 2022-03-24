package elements;

import command.Command;
import command.FlipperElement;
import flipper.Flipper;
import mediator.Mediator;

public class Ramp implements FlipperElement {

    Flipper flipper;

    Mediator mediator;

    public Ramp(Mediator mediator) {
        this.mediator = mediator;
    }

    Boolean raised = false;

    Command command;

    public Boolean isRaised() {
        return raised;
    }

    public void setRaised(Boolean raised) {
        this.raised = raised;
    }

    public void setCommand(Command command) {
        this.command = command;
    }


    public void raiseRamp() {
        System.out.println("Ramp raised!");
    }

    @Override
    public void hit() {
        mediator.mediate(this); // callback
        command.execute();
    }
}
