package app;

import command.bumpercommand.AddPointsBumperHitCommand;
import elements.Bumper;
import elements.Ramp;
import elements.SlingShot;
import flipper.Flipper;

public class Main {
    public static void main(String[] args) {

        Flipper flipper = new Flipper();
        flipper.init();

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








    }
}
