import command.CommandExecutor;
import command.Hit;
import command.bumpercommand.ActivateBumper;
import command.bumpercommand.ApplyBump;
import command.rampcommand.RaiseRamp;
import command.slingshotcommand.Shoot;
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

        executor.addCommand(new ActivateBumper(bumper1));
        executor.addCommand(new ApplyBump(bumper1));
        executor.addCommand(new Shoot(slingShot1));
        executor.addCommand(new RaiseRamp(ramp));
        executor.addCommand(new Hit(ramp));
        executor.addCommand(new Hit(bumper1));
        executor.addCommand(new Hit(slingShot1));


        executor.executeCommands();
    }

}
