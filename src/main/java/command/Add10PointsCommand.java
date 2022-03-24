package command;

import command.Command;
import flipper.Flipper;

public class Add10PointsCommand implements Command {

    private Flipper flipper; // receiver

    public Add10PointsCommand(Flipper flipper) {
        this.flipper = flipper;
    }

    @Override
    public void execute() {
        flipper.increasePoints(10);
    }
}
