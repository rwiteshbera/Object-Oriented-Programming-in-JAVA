package oops.Constructor;
/*
 1. Constructor is a member method with the same name as class name.
 2. It will never return anything.
 3. It is called when an instance of class is created. At the time of calling constructor,
   memory for the object is allocated in the memory.
 4. Everytime an object is created using new keyword, at least one constructor is called. If
 there is no available constructor, the Java compiler provides a default constructor.
*/

class Calc{
    int num1;
    int num2;
    int result; // Instance Variable

    public Calc(){ // Constructor doesn't return anything
        num1 = 5;
        num2 = 10;
        System.out.println("I am the constructor without parameter.");
    }

    public Calc(int n){ // Parameterized Constructor
        num1 = n;
        num2 = n;
        System.out.println("I am the constructor with parameter");
    }
}
public class ConstructorExample1 {
    public static void main(String[] args) {
        // Calc() is the default constructor which is only for allocating memory

//      Calc obj = new Calc();
        Calc obj = new Calc(3);
        System.out.println(obj.num1);
    }
}
