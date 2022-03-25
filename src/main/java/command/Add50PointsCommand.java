package command;

import command.Command;
import flipper.Flipper;

public class Add50PointsCommand implements Command {

    private Flipper flipper; // receiver
    private int increasePointsBy;

    public Add50PointsCommand(Flipper flipper, int increasePointsBy) {
        this.flipper = flipper;
        this.increasePointsBy = increasePointsBy;
    }

    @Override
    public void execute() {
        flipper.increasePoints(increasePointsBy);
    }
}