package DSA.Searching;

public class FindString {
    public static void main(String args[]){
        String arr[]={"apple","banana","cherry","date","fig"};
        String element="cherry";
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(element)){
                found=true;
                break;
            }
        }
        System.out.println(found ? "Element found" : "Element not found");
    }
}
