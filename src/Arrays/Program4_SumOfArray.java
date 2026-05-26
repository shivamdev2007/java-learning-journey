package Arrays;
import java.util.Scanner;
public class Program4_SumOfArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size:");
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("array element :");
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
        }
        System.out.println("sum = "+sum);
    }
}