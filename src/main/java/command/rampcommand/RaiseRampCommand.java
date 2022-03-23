package command.rampcommand;

import command.Command;
import elements.Ramp;

public class RaiseRampCommand implements Command {

    private Ramp ramp;

    public RaiseRampCommand(Ramp ramp) {
        this.ramp = ramp;
    }


    @Override
    public void execute() {
        ramp.raiseRamp();
    }
}
