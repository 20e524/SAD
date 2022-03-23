package command.slingshotcommand;

import command.Command;
import elements.SlingShot;

public class ShootCommand implements Command {

    private SlingShot slingShot;

    public ShootCommand(SlingShot slingshot) {
        this.slingShot = slingshot;
    }

    @Override
    public void execute() {
        slingShot.shoot();
    }
}
