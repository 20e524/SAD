package command;

import flipper.Flipper;

public class FlipperSayHiCommand implements Command {
    Flipper flipper;

    public FlipperSayHiCommand(Flipper flipper) {
        this.flipper = flipper;
    }


    @Override
    public void execute() {
        flipper.sayHi();
    }
}
