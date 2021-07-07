package oops.Method_and_ConstructorOverloading;

/*
    If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.


*/

class Casio{
    public void add(int i, int j)
    {
        System.out.println(i+j);
    }
    public void add(int i, int j, int k)
    {
        System.out.println(i+j+k);
    }
    public void add(double i, double j)
    {
        System.out.println(i+j);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Casio obj = new Casio();
        obj.add(2,3); // It goes into first method in class casio

        obj.add(2,3,5); //  It goes into second method in class casio

        obj.add(2,4.6); // It goes into third method in class casio
    }
}
