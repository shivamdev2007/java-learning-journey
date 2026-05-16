package If_Else.java;
import java.util.Scanner;
public class LargestOf2Numbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        int a = sc.nextInt();
        System.out.print("enter b:");
        int b = sc.nextInt();
        if (a>b){
            System.out.println("a is largest");

        }
        else {
            System.out.println("b is largest");
        }

    }
}
