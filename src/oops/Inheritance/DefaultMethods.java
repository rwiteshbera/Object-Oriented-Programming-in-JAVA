package oops.Inheritance;

//In Interface, normally we cannot define method with body. We can only
// declare methods. But by using a special keyword 'default', we can define
// a method in interface.
interface Demo{
    void abc();
    default void show(){
        System.out.println("In Show");
    }
}

class Hello implements  Demo{
    public void abc(){
        System.out.println("I am ABC.");
    }
}
public class DefaultMethods {
    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.show();
        obj.abc();
    }
}
