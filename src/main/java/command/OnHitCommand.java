package command;



public class OnHitCommand implements Command {
    private FlipperElement flipperElement;

    public OnHitCommand(FlipperElement flipperElement) {
        this.flipperElement = flipperElement;
    }

    @Override
    public void execute() {
        flipperElement.hit();
    }
}
