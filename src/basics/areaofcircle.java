package basics;
import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius of circle:");
        int r = sc.nextInt();
        System.out.println("area of circle is: " + (3.14*r*r));
    }
}
