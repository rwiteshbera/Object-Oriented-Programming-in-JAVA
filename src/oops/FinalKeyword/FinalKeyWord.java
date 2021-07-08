package oops.FinalKeyword;

// 1. If you make any variable as final, you cannot change the value of final variable(It will be constant).
class Person{
    final int id = 5;
    public void setData()
    {
//        id = 12;
    }
}





// 2. If you make any method as final, you cannot override it.
class Bike{
    final void run(){

    }
}
class Honda extends Bike{
//     void run(){
//
//    }
}





// 3. If you make any class as final, you cannot extend it.
final class Human{
    public Human(){
        System.out.println("Hello");
    }
}
public class FinalKeyWord {
    public static void main(String[] args) {
        Person obj1 = new Person();
//      Honda obj2 = new Honda();
        Human obj3 = new Human();
    }
}
