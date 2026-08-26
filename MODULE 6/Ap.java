import java.util.Scanner;
public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for(int i=1;i<=3*n-2;i+=3){
            System.out.println(i);
        }
    }
}