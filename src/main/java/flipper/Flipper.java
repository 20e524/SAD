package flipper;

import command.Add50PointsCommand;
import command.FlipperElement;
import command.compositecommands.BumperHitCompositeCommand;
import command.compositecommands.RaiseRampShootSlingshotCommand;
import elements.Bumper;
import elements.Ramp;
import elements.SlingShot;
import elements.Target;
import mediator.Mediator;
import state.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Flipper implements Mediator {

    private FlipperState noCredit;
    private FlipperState ready;
    private FlipperState playing;
    private FlipperState end;

    private Ramp ramp;
    private Bumper bumper;
    private SlingShot slingShot;
    private Target target;

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
        ramp = new Ramp(this);
        bumper = new Bumper(this);
        slingShot = new SlingShot(this);
        target = new Target(this);


        if(coinInMachine == 0) {
            flipperState = noCredit;
        }

    }

    public void init() {


        // slingShot.setCommand(new RaiseRampCommand(ramp));
        // SlingShot slingShot1 = new SlingShot();
        // Ramp ramp = new Ramp(this);
        flipperElements.add(bumper);
        //flipperElements.add(slingShot);
        // flipperElements.add(slingShot1);
        flipperElements.add(ramp);
        flipperElements.add(target);
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
        System.out.println("You won "+points);
    }

    public int getPoints() {
        return points;
    }

    public void guessToWinPoints() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = r.nextInt((3 - 1) + 1) + 1;
        System.out.printf("zahl zwischen 1 und 3 erraten:");
        int guess = scanner.nextInt();
        if (guess == randomNumber) {
            System.out.println("guessed correct.");
            increasePoints(30);
        }

    }

    @Override
    public void mediate(FlipperElement flipperElement) {
        if (flipperElement == ramp) {
            reactOnRamp();
        } else if (flipperElement == bumper) {
            bumper.setCommand(new BumperHitCompositeCommand(this));
        } else if (flipperElement == target) {
            target.setCommand(new Add50PointsCommand(this, 50));
        }
    }

    private void reactOnRamp() {
        ramp.setCommand(new RaiseRampShootSlingshotCommand(ramp, slingShot));
    }

//    public void raiseRamp(Ramp ramp) {
//    }
}
