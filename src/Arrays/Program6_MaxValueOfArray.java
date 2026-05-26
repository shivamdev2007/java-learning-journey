package Arrays;
import java.util.Scanner;
public class Program6_MaxValueOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt();
        System.out.println("enter elements:");
        int [] arr=new int[n];
        for (int i=0;i<n;i++ ){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++){
            if (arr[i]>max) max=arr[i];

        }
        System.out.print("max value from array :");
        System.out.println(max);
    }
}
