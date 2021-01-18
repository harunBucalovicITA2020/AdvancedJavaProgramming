package generic;

public class Box <G> {
    public G generic;

    public Box(G generic) {
        this.generic = generic;
    }

    public G getGeneric() {
        return generic;
    }
}
