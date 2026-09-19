import java.util.Scanner;
public class compositeprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n =sc.nextInt();

        int X = 0; // 0 means prime
        for(int i=2;i<=n-1;i++){
            if(n%i==0){ // i is a factor of n
            System.out.println("composite number");
            X = 1; // 1 means composite
            break;
            }
        }
            if(n==1) System.out.println("neither prime nor composite");
            
            else if(X == 0) System.out.println("prime number");
            }
        }
    