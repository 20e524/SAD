package command.bumpercommand;

import command.Command;
import elements.Bumper;
import flipper.Flipper;

public class AddPointsBumperHitCommand implements Command {

    private Flipper flipper; // receiver

    public AddPointsBumperHitCommand(Flipper flipper) {
        this.flipper = flipper;
    }

    @Override
    public void execute() {
        flipper.increasePoints(10);
    }
}
