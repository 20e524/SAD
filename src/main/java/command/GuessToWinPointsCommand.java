package command;

import flipper.Flipper;

public class GuessToWinPointsCommand implements Command{

    Flipper flipper;

    public GuessToWinPointsCommand(Flipper flipper) {
        this.flipper = flipper;
    }

    @Override
    public void execute() {
        flipper.guessToWinPoints();
    }
}
