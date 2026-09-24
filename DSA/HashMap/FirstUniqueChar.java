package HashMap;
import java.util.*;
public class FirstUniqueChar {
    public static void main(String[] args) {
        String str="hgshag";
        Map<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hmap.get(ch)==1){
                System.out.println("First Unique character: "+ch);
                return ;
            }
        }
        System.out.print("No elements found");
    }
}
