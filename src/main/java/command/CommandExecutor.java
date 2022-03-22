// adapted from https://home.csulb.edu/~pnguyen/cecs277/lecnotes/Command%20Pattern.pdf

package command;

import java.util.ArrayList;
import java.util.List;


public class CommandConductor {

    private List<Command> commandList
            = new ArrayList<Command>();

    public void addCommand(Command c){
        commandList.add(c);
    }

    public void executeCommands() {
        for(Command c : commandList){
            c.execute();
        }
    }
}