package Arrays;

import java.util.Scanner;

public class Program5_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 17, 19, 23, 29};
        Scanner sc = new Scanner(System.in);
        System.out.print("x:");
        int x = sc.nextInt();
        boolean flag = false;   //not found
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == x) {
                flag = true;  //found
                break;
            }

        }
        if (flag==false) System.out.println("x not found");
        else System.out.println("x  found");


    }
}