public class CWH_17_logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND..."); // (evaluates to true if both or more than, conditions are true or else false)
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a && b && c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("For Logical OR..."); // (evaluates to true if one of the conditions is true)
        boolean a1 = true;
        boolean b1 = false;
        if (a1 || b1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("For Logical NOT...");
        boolean a2 = true;
        boolean b2 = false;
        System.out.print("Not (a2) is ");
        System.out.println(!a2);
        System.out.print("Not (b2) is ");
        System.out.println(!b2);
    }
}











