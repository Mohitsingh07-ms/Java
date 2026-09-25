import java.util.Scanner;

public class numberbridge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter n : ");
        int n = sc.nextInt();

        // First row
        for(int i=1; i<=2*n-1; i++) {
            System.out.print("* ");
        }
        System.out.println();

        n--;

        // Remaining rows
        int nsp = 1;
        for(int i=1; i<=n; i++) {

            // Left stars
            int a = 1;
            for(int j=1; j<=n+1-i; j++) {
                System.out.print(a++ + " ");
            }

            // Middle spaces
            for(int j=1; j<=nsp; j++) {
                System.out.print(" "+ " ");
                a++; //very important
            }

            // Right stars
            nsp += 2;
            for(int j=5; j<=n+5-i; j++) {
                System.out.print(a++ + " ");
            }

            System.out.println();
        }
    }
}