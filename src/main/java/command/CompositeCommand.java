package command;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeCommand implements Command{

    private List<Command> children = new ArrayList<Command>();

    public void addChild(Command c) {
        children.add(c);
    }

    @Override
    public void execute() {
        for (Command child: children
             ) {
            child.execute();
        }

    }
}
