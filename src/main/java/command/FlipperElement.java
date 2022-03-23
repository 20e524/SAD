package command;

import command.bumpercommand.AddPointsBumperHitCommand;

public interface FlipperElement {

    public void hit();

    public void setCommand(Command command);
}
