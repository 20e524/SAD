import state.FlipperState;

public class Flipper {

    FlipperState noCredit;
    FlipperState ready;
    FlipperState playing;
    FlipperState end;

    FlipperState flipperState;

    int coinInMachine = 0;

    public Flipper() {
        noCredit = new NoCredit(this);
        ready = new Ready(this);
        playing = new Playing(this);
        end = new End(this);


        if(coinInMachine == 0) {
            flipperState = noCredit;
        }

    }

    void setFlipperState(FlipperState newFlipperState) {
        flipperState = newFlipperState;
    }

    public void insertCoin() {
        coinInMachine++;
        flipperState.insertCoin();
        System.out.println("coins: "+coinInMachine);
    }

    public void pressStartButton() {
        flipperState.pressStartButton();
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
}
