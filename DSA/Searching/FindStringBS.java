package DSA.Searching;

public class FindStringBS {
    public static void main(String args[]){
        String name[]={"bahu","cartoon","deathrace","wrongturn"};
        String target="deathrace";
        int low=0;
        int high=name.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int cmp=name[mid].compareTo(target);
            if(cmp==0){
                System.out.println("Element found at: "+mid);
                return;
            }
            else if(cmp<0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }
}
