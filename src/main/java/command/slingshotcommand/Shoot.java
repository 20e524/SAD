package command.slingshotcommand;

import command.Command;
import elements.Bumper;
import elements.SlingShot;

public class Shoot implements Command {

    private SlingShot slingShot;

    public Shoot(SlingShot slingshot) {
        this.slingShot = slingshot;
    }

    @Override
    public void execute() {
        slingShot.shoot();
    }
}
