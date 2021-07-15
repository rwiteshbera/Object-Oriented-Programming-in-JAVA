package oops.Interfaces;

/*
multiple inheritance is not supported in the case of class because of ambiguity. However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class.
*/
interface A{
    void printA();
}

interface B{
    void printB();
}

class Display implements A, B{
    public void printA(){
        System.out.println("Hello, I am interface A.");
    }
    public void printB(){
        System.out.println("Hello, I am interface B.");
    }
}
public class Multiple_Inheritance_by_interface {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.printA();
        obj.printB();
    }
}
