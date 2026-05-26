package METHODS;
import java.util.Scanner;
public class Swap2Numbers {
    public static void swap(int a,int b){
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
         a = sc.nextInt();
        System.out.print("b:");
         b = sc.nextInt();
        int Temp=a;      //temp=temporary number
        a=b;
        b=Temp;
        System.out.println("a="+a +" "+ "b="+b);
        System.out.println("hence number are swaped");

    }
    static void main() {
        swap(2,8);






    }


    }

