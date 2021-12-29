package oop.oop2;

class Solution {
    static {
        System.out.println("Static block invoked");
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
    }
}
