import state.FlipperState;

public class End implements FlipperState {

    Flipper flipper;

    public End(Flipper newFlipper) {
        flipper = newFlipper;
    }

    @Override
    public void insertCoin() {
        System.out.println("endState: free game!!!");
    }

    @Override
    public void pressStartButton() {

    }

    @Override
    public void play() {
        System.out.println("endState: this is the end");
        flipper.coinInMachine--;

        var winningChance = Math.random();
        if (winningChance < 0.5) {
            flipper.insertCoin();
            flipper.setFlipperState(flipper.getReady());
            System.out.println("endState: Winner");

        } else {
            flipper.setFlipperState(flipper.getNoCredit());
            System.out.println("endState: Loser");

        }
    }

}
