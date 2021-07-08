package oops.AbstractKeyword;

/*
The abstract keyword is used to achieve abstraction in Java. It is a non-access modifier which is used to create abstract
 class and method.
The role of an abstract class is to contain abstract methods. However, it may also contain non-abstract methods. The
method which is declared with abstract keyword and doesn't have any implementation is known as an abstract method.
*/

abstract class Human{ // Object of abstract class cannot be created.
    public abstract void display();
    public void perform(){

    }
}

class Man extends Human{
    @Override
    public void display() {

    }
}
public class AbstractDemo {
    Man obj = new Man();
}
