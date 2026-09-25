import java.util.Scanner;

public class starbridge {

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
        int nsp = 1;

        // Remaining rows
        for(int i=1; i<=n; i++) {

            // Left stars
            for(int j=1; j<=n+1-i; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for(int j=1; j<=nsp; j++) {
                System.out.print("  ");
            }

            // Right stars
            nsp += 2;
            for(int j=1; j<=n+1-i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}