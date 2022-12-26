import java.util.ArrayList;
import java.util.List;

public class MinStack {

    public void push(int val) {
        //adds a value to the stack
        List<Object> list = new ArrayList<>();
        list.add(val);

    }

    public void pop() {

    }

    public int top() {

        return 1;
    }

    public int getMin() {
     return 1;
    }

    public static void main(String[] args){
        MinStack minStack = new MinStack();
        minStack.push(3);

    }
}
