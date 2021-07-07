package oops.Method_and_ConstructorOverloading;

class Casino{
    public Casino()
    {
        System.out.println("I am the constructor without any parameter.");
    }
    public Casino(int i)
    {
        System.out.println("Constructor with one parameter");
    }
    public Casino(int i, int j)
    {
        System.out.println("Constructor with two parameter");
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Casino obj1 = new Casino();
        Casino obj2 = new Casino(10);
        Casino obj3 = new Casino(10,20);
    }
}
