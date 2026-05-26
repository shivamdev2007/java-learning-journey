package basics;
import java.util.Scanner;
public class averageof3num {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        int a = sc.nextInt();

        System.out.print("b:");
        int b = sc.nextInt();

        System.out.print("c:");
        int c = sc.nextInt();

        System.out.println("average:" + (a + b + c)/3);
    }
}