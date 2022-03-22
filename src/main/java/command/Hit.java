package command;



public class Hit implements Command {
    private FlipperElement element;

    public Hit(FlipperElement element) {
        this.element = element;
    }

    @Override
    public void execute() {
        element.hit();
    }
}
