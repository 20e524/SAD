package elements;

public class Bumper {

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


}
