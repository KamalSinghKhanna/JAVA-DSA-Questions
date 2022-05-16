package Basics;

// import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int a = input.nextInt();
        // int b = input.nextInt();
        // int n = input.nextInt();
        int a = 0;
        int b  = 1;
        int n = 7;
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
}
