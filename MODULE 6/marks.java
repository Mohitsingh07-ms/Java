import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int n = sc.nextInt();
        
        if(n>= 85) {
            System.out.println("excellent");
        }
if(n>= 64 && n<=84) {
    System.out.println("good");
}
if(n>= 50 && n<=63) {
    System.out.println("average");
}
if(n<50) {
    System.out.println("fail");
}
    }
}