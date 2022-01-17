package oop.oop3;

public class Box {
    double length;
    double height;
    double width;

    public Box() {
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }

    // Cube
    public Box(double side) {
        super();

        this.width = side;
        this.length = side;
        this.height = side;
    }

    public Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Box(Box old) {
        this.height = old.height;
        this.width = old.width;
        this.length = old.length;
    }


    public void information () {
        System.out.println("Running the box");
    }
}
