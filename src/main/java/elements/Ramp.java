package elements;

import command.Command;
import command.FlipperElement;

public class Ramp implements FlipperElement {

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
        command.execute(); // callback
    }
}
