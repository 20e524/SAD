import state.FlipperState;

public class NoCredit implements FlipperState {

    Flipper flipper;

    public NoCredit(Flipper newFlipper) {
        flipper = newFlipper;
    }


    @Override
    public void insertCoin() {
        System.out.println("noCreditState: Coin has been entered");
        flipper.setFlipperState(flipper.getReady());
    }

    @Override
    public void pressStartButton() {
        System.out.println("noCreditState: Coin needs to be entered");
    }

}
