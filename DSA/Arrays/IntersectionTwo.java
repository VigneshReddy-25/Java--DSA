package DSA.Arrays;

public class IntersectionTwo {
    public static void main(String args[]){
    //     int a[]={1,2,2,4,6};
    //     int b[]={2,2,3,4};
    //     int c[]={1,2,3,6};
    //     for(int i=0;i<a.length;i++){
    //         boolean alreadyPrint=false;
    //         for(int k=0;k<i;k++){
    //             if(a[k]==a[i]){
    //                 alreadyPrint=true;
    //                 break;
    //             }
    //         }
    //         if(alreadyPrint) continue;
    //         for(int j=0;j<b.length;j++){
    //             if(a[i]==b[j]){
    //                 for(int l=0;l<c.length;l++){
    //                     if(a[i]==c[l]){
    //                         System.out.print(a[i]+" ");
    //                         break;
    //                     }
    //                 }
    //             }
    //         }
    //     }
        int a[]={1,2,2,4,6};
        int b[]={2,2,3,4};
        int c[]={1,2,3,6};
        for(int i=0;i<a.length;i++){
            boolean alreadyPrint=false;
            for(int k=0;k<i;k++){
                if(a[k]==a[i]){
                    alreadyPrint=true;
                    break;
                }
            }
            if(alreadyPrint) continue;
            boolean foundInB=false;
            boolean foundInC=false;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    foundInB=true;
                    break;
                }
            }
            if(!foundInB) continue;
            for(int l=0;l<c.length;l++){
                if(a[i]==c[l]){
                    foundInC=true;
                    break;
                }
            }
            if(foundInC){
                System.out.print(a[i]+" ");
            }
        }
    }
}
