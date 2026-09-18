package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        String str="hgshagggg";
        Map<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hmap.get(ch)>=(str.length()/2)){
                System.out.println("First Unique character: "+ch);
                return ;
            }
        }
        System.out.print("No elements found");
    }
}
