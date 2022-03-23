import command.CommandExecutor;
import command.rampcommand.RaiseRampCommand;
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

        Bumper bumper1 = new Bumper("bumper1");
        SlingShot slingShot1 = new SlingShot();
        Ramp ramp = new Ramp();

        // bumper 1 bekommt ein kommando-objekt, dessen execute-Methode er bei einem hit aufruft.
        bumper1.setCommand(new RaiseRampCommand(ramp));

        bumper1.hit();





    }
}
