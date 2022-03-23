package command.bumpercommand;

import command.Command;
import elements.Bumper;

public class ApplyBumpCommand implements Command {

    private Bumper bumper; // receiver

    public ApplyBumpCommand(Bumper bumper) {
        this.bumper = bumper;
    }

    @Override
    public void execute() {
        bumper.applyBump();
    }
}
