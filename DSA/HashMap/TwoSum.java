package HashMap;
import  java.util.HashMap;
import  java.util.Map;
public class TwoSum {
    public static void main(String args[]){
        int arr[]={1,2,3,4,6,9,10,11};
        int target=7;
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int dif=target-arr[i];
            if(hmap.containsKey(dif)){
                System.out.println(arr[i]+" "+dif);
            }
            hmap.put(arr[i],i);
        }
        System.out.println("No element found");
    }
}
