package elements;

import command.FlipperElement;

public class Bumper implements FlipperElement {

    private String identifier;

    public Bumper(String identifier) {
        this.identifier = identifier;
    }

    public void activate() {
        System.out.println("bumper " + identifier + " activated");
    }

    public void applyBump() {
        System.out.println("Bump " + identifier);
    }


    @Override
    public void hit() {
//        this.applyBump();
        System.out.println("bumper hit implementation running");
    }
}
