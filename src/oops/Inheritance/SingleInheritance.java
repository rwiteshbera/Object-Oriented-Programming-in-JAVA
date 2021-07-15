package oops.Inheritance;

// Inheritance in java is a mechanism in which one class acquires all the properties of another class.
// Subclass or derived class : It is a class which inherits the properties and objects of another class.
// Parent Class / Super Class : It is the class from which subclass inherits the properties.

class Company{
    String CEO = "Naveen";
    void displayCEO(){
        System.out.println("CEO of the company is: " + CEO);
    }
}

class Employee extends Company{
    String name = "Rwitesh";
    void displayName(){
        System.out.println("Employee name: " + name);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayCEO();
        e.displayName();
    }
}
