package command.rampcommand;
//
import command.Command;
import elements.Ramp;
import flipper.Flipper;
//
//
public class RaiseRampCommand implements Command {
//
 private Flipper flipper;
 private Ramp ramp;

    public RaiseRampCommand(Ramp ramp) {
       this.ramp = ramp;
   }
   @Override
    public void execute() {
        ramp.raiseRamp();
    }
}
