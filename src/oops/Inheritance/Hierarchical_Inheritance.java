package oops.Inheritance;

//When two or more classes inherits a single class, it is known as hierarchical inheritance.
class Animal{
    void eat(){
        System.out.println("Eating.");
    }
}

class Dog extends Animal{

}

class Cat extends Animal{

}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
    }
}
