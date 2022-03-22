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


        Bumper bumper1 = new Bumper();
        Command activateBumperCommand = new ActivateBumper(bumper1);
        Command bumpCommand = new ApplyBump(bumper1);

        SlingShot slingShot1 = new SlingShot();
        Command shoot = new Shoot(slingShot1);

        Ramp ramp = new Ramp();
        Command raise = new RaiseRamp(ramp);

        CommandExecutor executor = new CommandExecutor();

        executor.addCommand(activateBumperCommand);
        executor.addCommand(bumpCommand);
        executor.addCommand(shoot);
        executor.addCommand(raise);


        executor.executeCommands();


    }
}
