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
        System.out.println("playingState: Author: Fritz & Viktor");
    }

    @Override
    public void play() {
        if (flipper.ballinMachine == 0) {
            flipper.setFlipperState(flipper.getEnd());
        } else {
            System.out.println("playingState: playing flipper.Flipper: ding, ding, bing, bing, brrrrrr");
            var hitRandomElement = Math.ceil(Math.random()*3);

            switch((int) hitRandomElement) {
                case 1:
                    flipper.getFlipperElements().get(0).hit();

                case 2:
                    flipper.getFlipperElements().get(1).hit();

                case 3:
                    flipper.getFlipperElements().get(2).hit();
            }

            var chance = Math.random();
            if (chance < 0.85) {
                flipper.ballinMachine--;
            }
        }


    }

}
