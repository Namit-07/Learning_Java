public class CWH_24_BreakandContinue {
    public static void main(String[] args) {
        // Break and Continue using loops!!
         /* for (int i=0; i<5; i++) {
            System.out.println(i);
            System.out.println("Java is Great!!");
            if (i==4){
                System.out.println("Breaking the loop");
                break; */

        /*int i = 0;
        do {
            System.out.println(i);
            System.out.println("Java is Great!!");
            if (i == 2) {
                System.out.println("Breaking the loop");
                break;
            }
            i++;

        } while (i < 5);
        System.out.println("Loop end's here"); */

        //for (int i = 0; i < 5; i++) {
        //if (i == 2) {
        //System.out.println("Breaking the loop");
        //continue;

        //System.out.println(i);
        System.out.println("Java is Great!!");

        int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great!!");

        } while (i < 5);
        System.out.println("Loop end's here");
    }
}



























