
import java.util.Scanner;

public class Ifelsestatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        System.out.println("Even Numbers");
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nOdd Numbers");
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}