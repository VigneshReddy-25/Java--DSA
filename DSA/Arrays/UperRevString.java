package DSA.Arrays;

public class UperRevString {
    public static void main(String args[]){
        String str="This is a java program";
      String str1[]=str.split(" ");
      for(int i=0;i<str1.length;i++){
        if(i%2==0){
          str1[i]=str1[i].toUpperCase();
        }
        else{
          String res="";
          for(int j=str1[i].length()-1;j>=0;j--){
            res+=str1[i].charAt(j);
          }
          str1[i]=res;
        }
      }
      String result=String.join(" ",str1);
      System.out.println(result);
    }
}
