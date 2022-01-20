package oop.oop9;

interface Bank {
    static void greet() {
        System.out.println("Hi!, I'm from Bank interface.");
    }

    default float rateOfInterest() {
        System.out.println("Default Value");
        return 0;
    }
}

class A_Bank implements Bank {
    @Override
    public float rateOfInterest() {
        return 9.5f;
    }
}

class B_Bank implements Bank {
    @Override
    public float rateOfInterest() {
        return 10.5f;
    }
}

class C_Bank implements Bank {
//    @Override
//    public float rateOfInterest() {
//        return 10.0f;
//    }
}
public class Main {
    public static void main(String[] args) {
//        Bank b = new A_Bank();
//        float rate1 = b.rateOfInterest();
//        System.out.println(rate1);
//
//        Bank c = new B_Bank();
//        float rate2 = c.rateOfInterest();
//        System.out.println(rate2);
//
//        Bank d = new C_Bank();
//        float rate3 = d.rateOfInterest();
//        System.out.println(rate3);

        Bank b = new A_Bank();
        System.out.println(b.rateOfInterest());

        Bank.greet();
    }
}
