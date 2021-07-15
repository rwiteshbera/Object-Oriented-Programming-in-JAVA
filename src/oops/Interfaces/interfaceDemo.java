package oops.Interfaces;

/* Java interface is a blueprint of a class to achieve abstraction.
Interface can only contains abstract method. (This is a difference between
abstract class and interface.) Method shouldn't have body.

1. Why use Java interface?
-> It is used to achieve abstraction.
-> By interface we can support the functionality of multiple inheritance, because
by default Java doesn't support multiple inheritance.
-> It can be used to achieve loose coupling.
*/

//Relationship between class and interfaces
// Class -> extends -> Class
// Interface -> extends -> Interface
// Class -> implements -> Interface

interface print{
    void write();
}

class pen implements print{
    public void write(){
        System.out.println("I am a pen.");
    }
}

class pencil implements print{
    public void write(){
        System.out.println("I am a pencil.");
    }
}
public class interfaceDemo {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.write();

        pencil p2 = new pencil();
        p2.write();
    }
}
