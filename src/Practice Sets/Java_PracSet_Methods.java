public class Java_PracSet_Methods {
    /*static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d\n", n, i, n * i);
        }
    }
    /* static void stars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    // Sum(n) = 1 + 2 + 3 ... + n
    // Sum(n) = 1 + 2 + 3 ... + n-1 + n
    // Sum(n) = sum(n-1) + n
    // Sum(3) = 3 + sum(2)
    // Sum(3) = 3 + 2 + sum(1)
    // Sum(3) = 3 + 2 + 1
    /*static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }*/


    public static void main(String[] args) {
        // Question 1:
        //multiplication(5);

        // Question 2:
        //stars(4);

        // Question 3:
        //System.out.println(sumRec(3));


    }
}
