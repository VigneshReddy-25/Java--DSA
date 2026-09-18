package HashMap;
import java.util.*;
public class PairDiff {
    public static void main(String[] args) {
        int arr[]={1,3,5,4,2};
        int target=2;
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(hmap.containsKey(num-target)){
                System.out.println(num-target+" "+num);
                return;
            }
            if(hmap.containsKey(num+target)){
                System.out.println(num + target+" "+num);
                return;
            }
            hmap.put(arr[i],i);
        }
        System.out.println("Elements not found");
    }
}
