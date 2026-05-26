package METHODS;

public class Scope {
    public static void main(String[] args){
        int i;
        i=15;
        System.out.println(i);
        fun();
        System.out.println(i);
    }
    public static void fun(){
        int i=8;
        System.out.println(i);

        System.out.println(i);


    }

}
