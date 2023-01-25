public class Main {
    public static void main (String[] args){
        IntStack stack = new IntStack(7);
        stack.push(5);
        stack.push(8);
        stack.push(6);
        stack.push(10);
        stack.push(2);
        stack.push(3);
        stack.push(7);

        System.out.println(stack.pop());
        System.out.println(stack.print());

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}
