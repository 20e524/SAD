package command.compositecommands;

import command.CompositeCommand;
import command.FlipperSayHiCommand;
import command.bumpercommand.AddPointsBumperHitCommand;
import flipper.Flipper;

public class BumperHitCompositeCommand extends CompositeCommand {

    Flipper flipper;

    public BumperHitCompositeCommand(Flipper flipper) {
        this.flipper = flipper;
        addChild(new AddPointsBumperHitCommand(flipper));
        addChild(new FlipperSayHiCommand(flipper));
    }
}
