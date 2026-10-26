package Stack;

import java.util.*;
public class Stacking {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public static  void main(String args[]) {
        Stacking stackOpe = new Stacking();
        stackOpe.pushEle(10);
        stackOpe.pushEle(-1);
        stackOpe.pushEle(0);
        stackOpe.pushEle(-8);
        System.out.println("Top Element: "+ stackOpe.peekEle());
        System.out.println("Minimum Element: "+stackOpe.getMin());
        stackOpe.popEle();
        System.out.println("Top Element: "+ stackOpe.peekEle());
        System.out.println("Minimum Element: "+stackOpe.getMin());
        stackOpe.popEle();
        System.out.println("Top Element: "+ stackOpe.peekEle());
        System.out.println("Minimum Element: "+stackOpe.getMin());
    }

    public void pushEle(int val){
        mainStack.push(val);
        if(minStack.isEmpty() || minStack.peek() > val) minStack.push(val);
    }

    public int peekEle() {
        return mainStack.peek();
    }

    public void popEle() {
        if(mainStack.isEmpty()){
            System.out.println("Stack is empty");
        }
        else if(mainStack.peek()==minStack.peek()) {
            minStack.pop();
            mainStack.pop();
        }
        else {
            mainStack.pop();
        }
    }
    public int getMin(){
        return minStack.peek();
    }
}
