package command.bumpercommand;

import command.Command;
import elements.Bumper;

public class ActivateBumper implements Command {

    private Bumper bumper;

    public ActivateBumper(Bumper bumper) {
        this.bumper = bumper;
    }

    @Override
    public void execute() {
        bumper.activate();
    }
}
