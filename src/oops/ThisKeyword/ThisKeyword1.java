package oops.ThisKeyword;
/*
 In Java, this is a reference variable that refers to the current object.
1. this can be used to refer current class instance variable.
2. this can be used to invoke current class method (implicitly)
3. this() can be used to invoke current class constructor.
4. this can be passed as an argument in the method call.
5. this can be passed as argument in the constructor call.
6. this can be used to return the current class instance from the method.

*/
class Calc1{
    int num1;
    int num2;
    int result; // Instance Variable

    /*
    The this keyword can be used to refer current class instance variable. If there is ambiguity between the    instance variables and parameters, this keyword resolves the problem of ambiguity.
    */
    public Calc1(int num1, int num2){ // Local Variable
        this.num1 = num1;
        this.num2 = num2;
    }
}
public class ThisKeyword1{
    public static void main(String[] args) {
        Calc1 obj = new Calc1(2,8);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}