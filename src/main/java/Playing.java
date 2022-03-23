import state.FlipperState;

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
            System.out.println("playingState: playing Flipper: ding, ding, bing, bing, brrrrrr");
            var chance = Math.random();
            if (chance < 0.85) {
                flipper.ballinMachine--;
            }
        }


    }

}
