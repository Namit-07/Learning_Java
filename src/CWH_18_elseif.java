import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

       /* if(age>50) {
            System.out.println("You are experienced!!");
        }
        else if(age>32) {
            System.out.println("You are Semi-experienced!!");
        }
        else if(age>18) {
            System.out.println("You are not experienced!!");
        }
        else if(age>0) {
            System.out.println("You are Newborn!!");
        }
        */
        switch (age) {
            case 18:
                System.out.println("You are not experienced!!");
                break;
            case 32:
                System.out.println("You are Semi-experienced!!");
                break;
            case 50:
                System.out.println("You are experienced!!");
            default:
                System.out.println("You are Newborn!!");
        }
        System.out.println("End of the program");
    }
}









