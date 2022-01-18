package oop.oop7;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println(" I want to be coder");
    }

    @Override
    void partner () {
        System.out.println("I love spiderman" );
    }
}
