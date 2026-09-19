import java.util.Scanner;
public class difAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int a = 4, d= 3;
        for (int i=4;i<=n;i++){
            System.out.println(a);
            a += d;
        }
}
}