package basics;
import java.util.Scanner;
public class perimeterofrectanle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length:");
        int l = sc.nextInt(); // l=lenght of rectangle
        System.out.println("enter breadth:");
        int b = sc.nextInt(); // b=breadth of rectangle
        System.out.println("perimeter of rectangle= " + (2*(l+b)));

    }
}