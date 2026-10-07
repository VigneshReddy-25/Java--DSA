package Recursion;

public class NtoOne {
    public static void main(String[] args) {
        int n=10;
        print(n);
        for(int i=n;i<10;i++){
            System.out.println(i);
        }
    }

    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
