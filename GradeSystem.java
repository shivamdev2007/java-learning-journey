package If_Else.java;
import java.util.Scanner;
public class GradeSystem {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your marks:");
        int m = sc.nextInt(); //m=marks
        if (m>=90){
            System.out.println("A grade");
        }
        else if (m>=75){
            System.out.println("B grade");
        }
        else if(m>=60){
            System.out.println("C grade");
        }
        else if (m>=40){
            System.out.println("D grade");
        }
        else {
            System.out.println("Fail");
        }
    }
}
