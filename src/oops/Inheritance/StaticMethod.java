package oops.Inheritance;

/*
the static method in an interface can be defined in the interface, but cannot be overridden in
Implementation Classes. To use a static method, Interface name should be instantiated with it, as it
is a part of the Interface only.
*/
interface ABC{
    int num = 8; // Variable created in interface are constant. We cannot change in it later
    // in other classes.
    static void display(){
        System.out.println("I am ABC interface.");
    }
}

class DemoImp implements ABC{
    public void show(){
//        num=5;
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        ABC.display();
    }
}
