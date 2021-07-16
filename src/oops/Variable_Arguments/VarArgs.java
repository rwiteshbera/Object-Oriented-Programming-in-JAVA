package oops.Variable_Arguments;

// If we don't know how many argument we will have to pass in the method, varargs is the
// better approach.

class Calc{
    int sum = 0;
    public int add(int ...n){ // The method can call 0 or more arguments
       for(int i : n) sum = sum+i;
       return sum;
    }
}
public class VarArgs {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.add(5,6,11,14,18));
    }
}
