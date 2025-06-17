import java.util.Scanner;

public class Java_PracSet4 {
    public static void main(String[] args) {
        // Question 1.
        /*int a = 10;
        if (a == 11) {
            //System.out.println("I am 11");
        }
        else{
            //System.out.println("I am not 11");
            */

        // Question 2.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Maximum marks");
        int max = sc.nextInt();
        System.out.println("Marks in Physics");
        int phy = sc.nextInt();
        if (phy<33) {
            System.out.println("You have failed");
        }
        System.out.println("Marks in Chemistry");
        int chem = sc.nextInt();
        if (chem<=33) {
            System.out.println("You have failed");
        }
        System.out.println("Marks in Mathematics");
        int maths = sc.nextInt();
        if (maths<=33) {
            System.out.println("You have failed");
        }
        System.out.println("Your pecentage is");
        int percentage = (phy+chem+maths)*100/max;
        System.out.println(percentage);

        if (percentage<=40) {
            System.out.println("You have failed");
        }
        else{
            System.out.println("You have passed");
            */

        // Question 3.
        /* Scanner sc = new Scanner(System.in);
        float tax = 0;
        System.out.println("You total income in Lakhs per annum");
        float income = sc.nextFloat();
        if (income <= 2.5) {
            tax = tax + 0;
        } else if (income > 2.5 && income <= 5) {
            tax = tax + (income - 2.5f) * 0.05f;
        } else if (income > 5 && income <= 10.0) {
            tax = tax + (5f - 2.5f) * 0.05f;
            tax = tax + (income - 5f) * 0.2f;
        } else if (income > 10) {
            tax = tax + (5f - 2.5f) * 0.05f;
            tax = tax + (10f - 5f) * 0.2f;
            tax = tax + (income - 10f) * 0.3f;
        }
        System.out.println("Total tax paid by employee is " + tax); */

        // Question 4.
        /*Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");*/

        // Question 5.
        /*Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        if (website.endsWith(".com")) {
            System.out.println("Website is commercial");
        } else if (website.endsWith(".org")) {
            System.out.println("Website is organisational");
        } else if (website.endsWith(".in")) {
            System.out.println("Website is indian"); */

        // Question 6.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        year %=4;
        if (year==0) {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }

    }
}













