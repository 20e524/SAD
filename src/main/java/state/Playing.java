package state;

import flipper.Flipper;

public class Playing implements FlipperState {

    Flipper flipper;



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
            System.out.println("playingState: playing flipper.Flipper: ding, ding, bing, bing, brrrrrr");

            // bumper 1 bekommt ein kommando-objekt, dessen execute-Methode er bei einem hit aufruft.
            System.out.println(flipper.getPoints());
            flipper.getFlipperElements().get(0).hit();
            System.out.println(flipper.getPoints());

            var chance = Math.random();
            if (chance < 0.85) {
                flipper.ballinMachine--;
            }
        }


    }

}
