package If_Else.java;
import java.util.Scanner;
public class LargestOf3Numbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        int a = sc.nextInt();
        System.out.print("enter b:");
        int b = sc.nextInt();
        System.out.print("enter c:");
        int c = sc.nextInt();
        if (a>b && a>c ){
            System.out.println("a is largest");
        }
        else if(b>a && b>c){
            System.out.println("b uis largest");
        }
        else {
            System.out.println("c is the largest");
        }

    }
}
