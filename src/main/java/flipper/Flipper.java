package flipper;

import command.FlipperElement;
import command.bumpercommand.AddPointsBumperHitCommand;
import elements.Bumper;
import elements.Ramp;
import elements.SlingShot;
import state.*;

import java.util.ArrayList;

public class Flipper {

    private FlipperState noCredit;
    private FlipperState ready;
    private FlipperState playing;
    private FlipperState end;

    private ArrayList<FlipperElement> flipperElements = new ArrayList<>();

    private FlipperState flipperState;

    private int points = 0;

    public int coinInMachine = 0;
    public int ballinMachine = 0;

    public Flipper() {
        noCredit = new NoCredit(this);
        ready = new Ready(this);
        playing = new Playing(this);
        end = new End(this);



        if(coinInMachine == 0) {
            flipperState = noCredit;
        }

    }

    public void init() {
        Bumper bumper1 = new Bumper("bumper1");
        bumper1.setCommand(new AddPointsBumperHitCommand(this));
        SlingShot slingShot1 = new SlingShot();
        Ramp ramp = new Ramp();
        flipperElements.add(bumper1);
        flipperElements.add(slingShot1);
        flipperElements.add(ramp);



    }

    public ArrayList<FlipperElement> getFlipperElements() {
        return flipperElements;
    }

    public void setFlipperState(FlipperState newFlipperState) {
        flipperState = newFlipperState;
    }

    public void insertCoin() {
        coinInMachine++;
        ballinMachine+=3;
        System.out.println("coins: "+coinInMachine);
        System.out.println("balls: "+ballinMachine);
        flipperState.insertCoin();
    }

    public void pressStartButton() {
        flipperState.pressStartButton();
    }

    public void play() {
        flipperState.play();
    }



    public FlipperState getNoCredit() {
        return noCredit;
    }

    public FlipperState getReady() {
        return ready;
    }

    public FlipperState getPlaying() {
        return playing;
    }

    public FlipperState getEnd() {
        return end;
    }

    public void applyBump(Bumper bumper) {
        bumper.bump();
    }

    public void increasePoints(int points) {
        this.points += points;
    }

    public int getPoints() {
        return points;
    }

//    public void raiseRamp(Ramp ramp) {
//    }
}
