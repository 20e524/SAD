package elements;

import command.FlipperElement;

public class Bumper implements FlipperElement {

    private String identifier;
    private Boolean active = false;

    public Bumper(String identifier) {
        this.identifier = identifier;
    }

    public void activate() {
        this.active = true;
        System.out.println("bumper " + identifier + " activated");
    }

    public void applyBump() {
        System.out.println("Bump " + identifier);
    }


    @Override
    public void hit() {
        if (active) {
            applyBump();
        }
        System.out.println("bumper hit implementation running");
    }
}
