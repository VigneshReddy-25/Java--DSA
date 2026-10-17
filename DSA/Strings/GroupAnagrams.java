package Strings;
import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> group(String[] strs) {
        Map<String,List<String>> hmap=new HashMap<>();
        for(String str:strs){
            int[] chArray=new int[26];
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                chArray[ch-'a']++;
            }
            String key=Arrays.toString(chArray);
            hmap.putIfAbsent(key, new ArrayList<>());
            hmap.get(key).add(str);
        }
        return new ArrayList<>(hmap.values());
    } 
    public static void main(String args[]) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(group(strs));
    }
}
