package Arrays;

public class Program7_2ndMaxValueOfArray {
    public static void main(String[] args) {
        int[] arr = {-4, 9, 6, 4, 5, 2};
        int max = Integer.MIN_VALUE;
       for (int i=0;i<arr.length;i++){
           if (arr[i]>max){
               max=arr[i];
           }
       }                               //smax=2nd max
       int smax = Integer.MIN_VALUE;
       for (int i=0;i< arr.length;i++){
           if (arr[i]>smax && arr[i]!=max){
               smax=arr[i];
           }
       }
        System.out.println("2nd max value from array is:"+smax);
    }
}