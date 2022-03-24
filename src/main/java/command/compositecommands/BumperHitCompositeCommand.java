package command.compositecommands;

import command.CompositeCommand;
import command.FlipperSayHiCommand;
import command.Add10PointsCommand;
import command.GuessToWinPointsCommand;
import flipper.Flipper;

public class BumperHitCompositeCommand extends CompositeCommand {

    Flipper flipper;

    public BumperHitCompositeCommand(Flipper flipper) {
        this.flipper = flipper;
        addChild(new Add10PointsCommand(flipper));
        addChild(new GuessToWinPointsCommand(flipper));
    }
}
