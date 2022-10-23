package Top75;

import java.util.Stack;

public class ImplementQueueWithStack_232 {

    Stack<Integer> s1;
    Stack<Integer> s2;
    public ImplementQueueWithStack_232() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {

        if(s2.empty()){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }
        else{
            return s2.pop();
        }
    }

    public int peek() {
        if(s2.empty()){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            return s2.peek();
        }
        else{
            return s2.peek();
        }
    }
}
