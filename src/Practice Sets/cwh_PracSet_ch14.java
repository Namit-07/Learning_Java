import java.util.Scanner;

public class cwh_PracSet_ch14 {
    public static void main(String[] args) {
        // Question 1
        // Syntax error
        //int a = 5;
//        int b = 10 --> no semicolon
//         c = a/b; --> c is not declared

        // Logical error
        // Write prime numbers from 1 to 10
//        System.out.println(2);
//        for (int i = 1; i<5; i++){
//            System.out.println(2*i + 1);
//        }
//        // Runtime error
//        int k;
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        k = sc.nextInt();
//        System.out.print("Enter a number to divide 1000: "+ 1000/k);


        // Question 2
//            try {
//                int z = 666/0;
//
//            }
//            catch (IllegalArgumentException e){
//                System.out.println("Haha");
//            }
//            catch (ArithmeticException e){
//                System.out.println("Hehe");
//
//        }

        // Question 3
        boolean flag = true;
        int [] marks = new int [3];
        marks [0] = 90;
        marks [1] = 80;
        marks [2] = 70;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int index;
        while (flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                i++;
            }
            catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }

        }
        if (i>=5){
            System.out.println("Error");
        }


    }
}
