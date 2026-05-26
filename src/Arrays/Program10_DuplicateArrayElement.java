package Arrays;

public class Program10_DuplicateArrayElement {
    public static void main(){
        int[] arr={1,5,3,4,4,6};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j])System.out.println(arr[i]);
            }
        }
    }
}


