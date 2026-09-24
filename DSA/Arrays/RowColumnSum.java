package DSA.Arrays;

public class RowColumnSum {
    public static void main(String args[]){
        int arr[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n=arr.length;
        for(int i=0;i<n;i++){
            int rowSum=0;
            for(int j=0;j<arr[i].length;j++){
                rowSum+=arr[i][j];
            }
            System.out.println("Sum of row " + i + ": " + rowSum);
        }
        for(int j=0;j<arr[0].length;j++){
            int colSum=0;
            for(int i=0;i<n;i++){
                colSum+=arr[i][j];
            }
            System.out.println("Sum of column " + j + ": " + colSum);
        }
    }
}
