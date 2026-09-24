package HashMap;
import java.util.Map;
import java.util.HashMap;
public class IsomorphicStrings {
    public static void main(String[] args) {
        String str1="egg";
        String str2="add";
        Map<Character,Character> hmap1=new HashMap<>();
        Map<Character,Character> hmap2=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if(hmap1.containsKey(ch1)){
                if(hmap1.get(ch1)!=ch2){
                    System.out.println(false);
                    return;
                }
            }
            if(hmap2.containsKey(ch2)){
                if(hmap2.get(ch2)!=ch1){
                    System.out.println(false);
                    return;
                }
            }
            hmap1.put(ch1,ch2);
            hmap2.put(ch2,ch1);
        }
        System.out.println(true);
    }
}
