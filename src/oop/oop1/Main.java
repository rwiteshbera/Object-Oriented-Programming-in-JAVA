package oop.oop1;

class Solution {
    int num1;
    int num2;
    Solution() {
        System.out.println("Constructor without any parameter");
    }

    Solution (int n) {
        num1 = n;
        num2 = n;
        System.out.println("Constructor with one parameter");
    }
    Solution (int m, int n) {
        num1 = m;
        num2 = n;
        System.out.println("Constructor with one parameter");
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s1 = new Solution(); // Constructor without any parameter
        Solution s2 = new Solution(1); // Constructor with one parameter
        Solution s3 = new Solution(1,2); // Constructor with one parameter
    }
}
