package command.rampcommand;

import command.Command;
import elements.Ramp;

public class RaiseRamp implements Command {

    private Ramp ramp;

    public RaiseRamp(Ramp ramp) {
        this.ramp = ramp;
    }


    @Override
    public void execute() {
        ramp.raiseRamp();
    }
}
