package Recursion;

public class StringReverse {
    public static void main(String[] args) {
        String str="hello";
        System.out.println(reverse(str));
    }
    static String reverse(String str){
        if(str.length()<=1){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
