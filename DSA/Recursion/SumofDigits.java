package Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(sum(546782));
    }
    static int sum(int n){
        int mod=n%10;
        
        if(n==0){
            return 0;
        }
        return mod+sum(n/10);
    }
}
