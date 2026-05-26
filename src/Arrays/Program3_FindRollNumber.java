package Arrays;

public class Program3_FindRollNumber {
    static void main() {

        int[] marks = {45,89,32,67,12,98,25,49};
        for (int i=0; i<marks.length; i++) {
            if (marks[i]<35){  //roll number = index of array
                System.out.println(i);
            }
        }
    }
}
