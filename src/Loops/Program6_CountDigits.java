package Loops;
import java.util.Scanner;
public class Program6_CountDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count += 1;
        }
        System.out.println(count+" digit number");
    }
}
