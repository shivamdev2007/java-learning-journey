package Pattern;
import java.util.Scanner;
public class Square {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");//n=side of square
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
