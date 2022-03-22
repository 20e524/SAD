package elements;

import command.FlipperElement;

public class SlingShot implements FlipperElement {

    public void shoot() {
        System.out.println("Slingshot shot.");
    }

    @Override
    public void hit() {
        System.out.println("slingshot hit implementation running");
    }
}
