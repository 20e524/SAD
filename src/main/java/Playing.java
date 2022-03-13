import state.FlipperState;

public class Playing implements FlipperState {

    Flipper flipper;

    public Playing(Flipper newFlipper) {
        flipper = newFlipper;
    }

    @Override
    public void insertCoin() {

    }

    @Override
    public void pressStartButton() {
        System.out.println("playingState: Author: Viktor");
    }

}
