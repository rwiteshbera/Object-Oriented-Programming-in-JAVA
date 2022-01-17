package oop.oop4;

interface One {
    public void print_geek();
}

class Two {
    public void print_for() {
        System.out.println("for");
    }
}

class Child extends Two implements One {
    @Override
    public void print_geek() {
        System.out.println("Geeks");
    }
}
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.print_geek(); // Geeks
    }
}
