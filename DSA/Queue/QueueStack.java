package Queue;

import java.util.*;

public class QueueStack {
    
    Stack<Integer> inp = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void push(int val) {
        inp.push(val);
    }

    public int pop() {
        if(out.isEmpty()){
            while(!inp.isEmpty()) {
                out.push(inp.pop());
            }
        }
        return out.pop();
    }

    public int peek() {
        if(out.isEmpty()){
            while(!inp.isEmpty()) {
                out.push(inp.pop());
            }
        }
        return out.peek();
    }

    public boolean isEmpty() {
        return inp.isEmpty() && out.isEmpty();
    }

    public static void main(String args[]) {
        QueueStack qs = new QueueStack();
        qs.push(20);
        qs.push(30);
        qs.push(40);
        qs.push(50);

        System.out.println("Poped: " + qs.pop());
        System.out.println("Peek: " + qs.peek());
        System.out.println(qs.isEmpty() ? "Queue is empty" : "Queue has elements");
    }
}
