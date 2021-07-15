package oops.Inheritance;

//When a class extends a class, which extends anther class then this is called multilevel inheritance.
class Car{
    void wheel(){
        System.out.println("The car has 4 wheels.");
    }
}

class organization extends Car {
    void company() {
        System.out.println("The name of the company is: Lamborghini");
    }
}

class model extends organization{
    void number(){
        System.out.println("Model Number is: Aventador LP 780-4.");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        model m = new model();
        m.wheel();
        m.company();
        m.number();
    }
}
