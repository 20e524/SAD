package command.bumpercommand;

import command.Command;
import elements.Bumper;

public class ActivateBumperCommand implements Command {

    private Bumper bumper;

    public ActivateBumperCommand(Bumper bumper) {
        this.bumper = bumper;
    }

    @Override
    public void execute() {
        bumper.activate();
    }
}
