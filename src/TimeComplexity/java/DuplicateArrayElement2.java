package TimeComplexity.java;

public class DuplicateArrayElement2 {
    public static void main(String[] args){
        int[] arr={5,1,3,4,2,3};
        int n=arr.length;
        boolean[]flag=new boolean[n+1];
        for (int i=0;i<n;i++){
            int ele=arr[i];
            if (flag[ele]==true){
                System.out.println(arr[i]);
            }
            flag [ele]=true;

        }


    }
}
