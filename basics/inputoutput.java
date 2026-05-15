package basics;
import java.util.Scanner;
public class inputoutput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter you name:");
        String name = sc.nextLine();
        System.out.println("hello "+ name + " you may have a glorious day");
    }
}
