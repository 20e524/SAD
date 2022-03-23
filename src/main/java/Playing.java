import command.CommandExecutor;
import command.OnHitCommand;
import command.bumpercommand.ActivateBumperCommand;
import command.bumpercommand.ApplyBumpCommand;
import command.rampcommand.RaiseRampCommand;
import command.slingshotcommand.ShootCommand;
import elements.Bumper;
import elements.Ramp;
import elements.SlingShot;
import state.FlipperState;

public class Playing implements FlipperState {

    Flipper flipper;

    Bumper bumper1 = new Bumper("bumper1");
    SlingShot slingShot1 = new SlingShot();
    Ramp ramp = new Ramp();

    CommandExecutor executor = new CommandExecutor();

    public Playing(Flipper flipper) {
        this.flipper = flipper;

    }

    @Override
    public void insertCoin() {

    }

    @Override
    public void pressStartButton() {
        System.out.println("playingState: Author: Viktor");
    }

    @Override
    public void play() {
        if (flipper.ballinMachine == 0) {
            flipper.setFlipperState(flipper.getEnd());
        } else {
            System.out.println("playingState: playing Flipper: ding, ding, bing, bing, brrrrrr");
            var chance = Math.random();
            if (chance < 0.85) {
                flipper.ballinMachine--;
            }
        }

        executor.addCommandToList(new ActivateBumperCommand(bumper1));
        executor.addCommandToList(new ApplyBumpCommand(bumper1));
        executor.addCommandToList(new ShootCommand(slingShot1));
        executor.addCommandToList(new RaiseRampCommand(ramp));
        executor.addCommandToList(new OnHitCommand(ramp));
        executor.addCommandToList(new OnHitCommand(bumper1));
        executor.addCommandToList(new OnHitCommand(slingShot1));


        executor.executeCommands();
    }

}
