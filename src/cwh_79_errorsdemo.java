import java.util.Scanner;

public class cwh_79_errorsdemo {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 0 // Error: no semicolon
        // b = 8; // Error : b not declared!

        // LOGICAL ERROR DEMO
        // Write a programm to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int n = 1; n < 5; n++) {
            System.out.println(2 * n + 1);
        }

        // RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
    }
}



