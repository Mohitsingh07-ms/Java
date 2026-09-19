import java.util.Scanner;
public class numbersquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=65;i<=n;i++){
        for(int j=65;j<=n;j++){
            System.out.print(j+ " ");
        }
        System.out.println();
        }
    }
    }
    //or we can write System.out.print((j+64)+ " ");