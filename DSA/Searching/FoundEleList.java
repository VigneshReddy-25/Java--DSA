package DSA.Searching;

import java.util.Arrays;
import java.util.List;

public class FoundEleList {
    public static void main(String args[]){
        List<String> al= Arrays.asList("pen","paper","book","pencil");
        String target="book";
        for(int i=0;i<al.size();i++){
            if(al.get(i).equals(target)){
                System.out.println("Element found at index: "+i);
                return;
            }
        }
        System.out.println("Not Found");
    } 
}
