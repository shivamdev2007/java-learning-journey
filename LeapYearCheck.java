package If_Else.java;
import java.util.Scanner;
public class LeapYearCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year:");
        int Y= sc.nextInt();
        if (Y%4==0){
            System.out.println(Y+" is a leap year");
        }
        else{
            System.out.println(Y+" is not a leap year");
        }

    }


}
