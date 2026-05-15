package METHODS;
import java.util.Scanner;
public class PASCALTRIANGLE {
    public static int fact(int x){
        int factx = 1;
        for (int i=1;i<=x;i++){
            factx = factx*i;
        }
        return factx;

    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                int icj = (fact(i))/(fact(j)*fact(i-j));
                System.out.print(icj+" ");
            }
            System.out.println();

        }

    }
}
