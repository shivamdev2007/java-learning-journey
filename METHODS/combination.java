package METHODS;
import java.util.Scanner;
public class combination {
    public static int fact(int x) {
        int factx = 1;
        for (int i = 1; i <= x; i++) {
            factx = factx * i;}
        return factx;


}
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        System.out.println("enter r:");
        int r = sc.nextInt();
        int nmr = n-r;    //nmr means n-r
        int ncr = fact(n)/(fact(r)*fact(nmr));
        int npr = fact(n)/fact(r);
        System.out.println("ncr value is :" + ncr);
        System.out.println("npr value is:" + npr);





    }
}