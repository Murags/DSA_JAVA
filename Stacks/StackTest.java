public class StackTest{
    public static void main(String[] args){
        StackX stack = new StackX(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        stack.push(11);

        // stack.printStack();

        System.out.println(stack.peek());

        //pop 5 elements
        for(int i = 0; i < 5; i++){
            stack.pop();
        }

        stack.printStack();
        // System.out.println(stack.peek());

        //pop 6 elements
        for(int i = 0; i < 6; i++){
            stack.pop();
        }
    }
}
