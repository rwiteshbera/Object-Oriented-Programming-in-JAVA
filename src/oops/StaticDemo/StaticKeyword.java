package oops.StaticDemo;

/*
The static keyword in Java is used for memory management mainly. We can apply
static keyword with variables, methods, blocks and nested classes. The static
keyword belongs to the class than an instance of the class.*/

/*
The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
*/

class employee{
    int id;
    int salary;
    static String ceo; // static says that it is the common property
    // of all the objects

    public void display(){
        System.out.println(id + " : " + salary + " : " + ceo);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        employee rwitesh = new employee();
        rwitesh.id = 10;
        rwitesh.salary = 4500;
        rwitesh.ceo = "Aman";

        employee anuj = new employee();
        anuj.id = 21;
        anuj.salary = 5000;

        rwitesh.display();
        anuj.display();
    }
}