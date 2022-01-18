package oop.oop6;

class X {

}

class Y extends X {

}
class Z {

}

public class Main {
    public static void main(String[] args) {
        Y objY = new Y();
        Z objZ = new Z();
//        System.out.println(objY instanceof X);

        System.out.println(objY.getClass().getName());
    }
}
