package Loops;
import java.util.Scanner;
public class Program7_SumOfDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        int l; //l=last digit
        int sum =0;
        while(n!=0){
            l=n%10;
            n=n/10;
            sum=sum+l;

        }
        System.out.print("sum of digits is:");
        System.out.println(sum);
    }
}
