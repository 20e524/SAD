import command.bumpercommand.ActivateBumper;
import command.bumpercommand.ApplyBump;
import command.Command;
import command.CommandExecutor;
import command.rampcommand.RaiseRamp;
import command.slingshotcommand.Shoot;
import elements.Bumper;
import elements.Ramp;
import elements.SlingShot;

public class Main {
    public static void main(String[] args) {

        Flipper flipper = new Flipper();

        flipper.pressStartButton();
        flipper.play();
        flipper.insertCoin();
        flipper.play();

        flipper.pressStartButton();
        flipper.pressStartButton();
        flipper.play();
        flipper.play();
        flipper.play();
        flipper.play();
        flipper.play();
        flipper.play();
        flipper.play();
        flipper.play();
        flipper.play();
        flipper.play();
        flipper.play();
        flipper.pressStartButton();

        flipper.play();
        flipper.play();




//        CommandExecutor executor = new CommandExecutor();




    }
}
