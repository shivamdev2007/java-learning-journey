package Loops;
import java.util.Scanner;
public class Program4_Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        int fact = 1;
        for (int i=1;i<=n;i++){
            fact = fact*i;

        }
        System.out.print(n+"!=");
        System.out.println(fact);
    }
}
