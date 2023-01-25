import java.util.Arrays;

public class IntStack {

    public IntStack(int capacity){
        this.capacity = capacity;
        stack = new int[capacity];
    }

    public void push (int item){
        stack[stack.length-capacity]=item;
        capacity--;
    }

    public int pop(){
        capacity++;
        int original = stack[stack.length-capacity];
        stack[stack.length-capacity]=0;
        return original;
    }

    public boolean isFull(){
        return capacity == 0;
    }

    public boolean isEmpty(){
        return stack.length==capacity;
    }

    public String print(){
        return Arrays.toString(stack);
    }

    private int capacity;
    private final int [] stack;
}
