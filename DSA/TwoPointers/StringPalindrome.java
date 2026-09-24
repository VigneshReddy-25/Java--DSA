package DSA1.TwoPointers;

public class StringPalindrome {
    public static void main(String arg[]){
        String str="level";
        int left=0;
        int right=str.length()-1;
        boolean palindrome=true;
        while(left<right){
            char ch1=str.charAt(left);
            char ch2=str.charAt(right);
            if(ch1==ch2){
                left++;
                right--;
            }
            else{
                palindrome=false;
                break;
            }
        }
        if(palindrome) System.out.println("Given string is palindrome");
        else System.out.println("Given string is not a palindrome");
    }
}
