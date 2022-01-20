package oop.oop9;

class A {
    int a = 5;

    public A() {
        System.out.println("I'm in class A");
    }

    public A(int a) {
        this.a = a;
//        System.out.println(a);
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("I am in class B");
    }

    public B (int x) {
        super(x);
    }
}

public class Main2 {
    public static void main(String[] args) {
        B b = new B(6);
    }
}
