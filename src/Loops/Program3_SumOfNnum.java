package Loops;
import java.util.Scanner;
public class Program3_SumOfNnum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum = sum+i;

        }
        System.out.print("sum of first "+n+" numbers is:");

        System.out.println(sum);
    }
}
