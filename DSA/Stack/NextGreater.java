package Stack;
import java.util.Stack;
import java.util.Arrays;

public class NextGreater {
    
    public static void main(String args[]) {
        int arr[]={4,12,5,3,1,2,5,1,2,4,6};
        Stack<Integer> stack=new Stack<>();
        int res[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--) {
            int val=arr[i];
            while(!stack.isEmpty() && stack.peek()<=val) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                res[i]=-1;
            }
            else {
                res[i]=stack.peek();

            }
            stack.push(val);
        }
        System.out.println(Arrays.toString(res));
    }
}
