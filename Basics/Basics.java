package Basics;

// import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // fibonacci(0, 1, 7);
        // System.out.println(occurence(234454, 4));
        System.out.println(reverse(1234));
    }

    
    //fibonacci
    static void fibonacci(int a, int b, int n){
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i <= n; i++)
        {
           int temp = a + b;
            a = b;
            b = temp;
            System.out.println(b);

        }
       
    }
    //how many time second number occure in first?

    static int occurence(int num1, int num2) {
        int count=0;
        while (num1 > 0) {
            int rem = num1%10;
            if (rem == num2) {
                count++;
            }
            num1 = num1/10;
        }
        return count;
    }

// find the reverse of number
    static int reverse(int num) {
        int ans = 0;
        while(num>0) {
            int rem = num%10;
            ans = ans*10+rem;
            num = num/10;
        }
        return ans;
        
    }
}
