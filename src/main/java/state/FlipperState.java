package state;

public interface FlipperState {

    /*
    state.NoCredit-State
    state.Ready-State
    state.Playing-State
     */

    void insertCoin();

    void pressStartButton();

    void play();

}
