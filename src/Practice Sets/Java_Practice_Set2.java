import java.util.Scanner;

public class Java_Practice_Set2 {
    public static void main(String[] args) {
        // Question 1.
        //float a = 7/4f*9/2f;
        //System.out.println(a);

        // Question 2.
        // Encrypting the grade
        char grade = 'B';
        grade = (char)(grade + 8);
        //System.out.println(grade);

        // Decrypting the grade
        grade = (char)(grade - 8);
        //System.out.println(grade);

        // Question 3.
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Number greater than 90");
        //int num = sc.nextInt();
        //System.out.println(num > 90);

        // Question 4.
        int v = 10;
        int u = 5;
        int a = 8;
        int s = 3;
        int k = (v*v - u*u)/(2*s);
        //System.out.println(k);

        // Question 5.
        int x =  7*49/7 + 35/7;
        System.out.println(x);

    }
}


