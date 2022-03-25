package command.compositecommands;

import command.Add10PointsCommand;
import command.CompositeCommand;
import command.GuessToWinPointsCommand;
import command.rampcommand.RaiseRampCommand;
import command.slingshotcommand.ShootCommand;
import elements.Ramp;
import elements.SlingShot;

public class RaiseRampShootSlingshotCommand extends CompositeCommand {

    private Ramp ramp;
    private SlingShot slingShot;

    public RaiseRampShootSlingshotCommand(Ramp ramp, SlingShot slingShot) {
        this.ramp = ramp;
        this.slingShot = slingShot;
        addChild(new RaiseRampCommand(ramp));
        addChild(new ShootCommand(slingShot));
    }


}
