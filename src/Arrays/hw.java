package Arrays;
import java.util.Scanner;
public class hw {
    static void main() {
        int[] arr = {23,65,78,54,59,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("x:");
        int x =sc.nextInt();
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (x<arr[i]){
                count+=1;
            }
        }
        System.out.println(count);


    }

}
