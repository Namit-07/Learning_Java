import java.util.Scanner;

public class CWH_05_Takinginput {
    public static void main(String[] args) {
        System.out.println("Taking user input");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        String s1 = sc.nextLine();
        System.out.println(s1);
        boolean b1= sc.hasNextInt();
        System.out.println(b1);
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        boolean b2= sc.hasNextInt();
        System.out.println(b2);
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is");
        System.out.println(sum);

    }
}
