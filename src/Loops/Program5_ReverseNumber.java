package Loops;
import java.util.Scanner;
public class Program5_ReverseNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        int l; //l=latdigit of number
        while(n!=0){
            l=n%10;
            n=n/10;
            System.out.print(l);
        }


    }

}
