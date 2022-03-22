package command;

import elements.Bumper;

public class ApplyBump implements Command {

    private Bumper bumper; // receiver

    public ApplyBump(Bumper bumper) {
        this.bumper = bumper;
    }

    @Override
    public void execute() {
        bumper.applyBump();
    }
}
