package If_Else.java;
import java.util.Scanner;
public class OddEvenCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("n is even");

        }
        else{
            System.out.println("n is odd");
        }
    }
}
