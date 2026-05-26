package Arrays;
import java.util.Scanner;

public class Program2_TakingInput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        System.out.println("enter Array elements:");
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}