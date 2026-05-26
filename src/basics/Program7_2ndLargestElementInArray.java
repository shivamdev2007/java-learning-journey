package basics;
import java.util.Scanner;
public class Program7_2ndLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt();
        System.out.println("enter elements:");
        int[] arr = new int[n];
        int l = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}