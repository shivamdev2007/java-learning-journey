package basics;
import java.util.Scanner;
public class sumof2numbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a:");
        int a = sc.nextInt();
        System.out.print("enter number b:");
        int b = sc.nextInt();
        System.out.println("a + b = " + (a+b));
    }
}
