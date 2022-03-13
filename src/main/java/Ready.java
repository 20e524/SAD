import state.FlipperState;

public class Ready implements FlipperState {

    Flipper flipper;

    public Ready(Flipper newFlipper) {
        flipper = newFlipper;
    }

    @Override
    public void insertCoin() {
        System.out.println("readyState: another coin has been inserted");
    }

    @Override
    public void pressStartButton() {
        System.out.println("readyState: Start Button has been pressed");
        flipper.setFlipperState(flipper.getPlaying());
    }

    @Override
    public void play() {
        System.out.println("readyState: press the start button first");
    }

}
