package oop.oop3;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    public BoxWeight (double length, double height, double width, double weight) {
        super(length, height, width); // This will call parent class constructor
        this.weight = weight;
    }
}