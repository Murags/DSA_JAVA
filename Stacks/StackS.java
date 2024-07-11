// stack.java
// demonstrates stacks
////////////////////////////////////////////////////////////////
public class StackS
{
    public int maxSize; // size of stack array
    public char[] stackArray;
    public int top; // top of stack
    //--------------------------------------------------------------
    public StackS(int s) // constructor
    {
        maxSize = s; // set array size
        stackArray = new char[maxSize]; // create array
        top = -1; // no items yet
    }
    //--------------------------------------------------------------
    public void push(char j) // put item on top of stack
    {
        if (isFull()){
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = j; // increment top, insert item
    }
    //--------------------------------------------------------------
    public char pop() // take item from top of stack
    {
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return '\0';
        }
       return stackArray[top--]; // access item, decrement top
    }
    //--------------------------------------------------------------
    public char peek() // peek at top of stack
    {
        return stackArray[top];
    }
    //--------------------------------------------------------------
    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }
    //--------------------------------------------------------------
    public boolean isFull() // true if stack is full
    {
        return (top == maxSize-1);
    }
    public void printStack(){

        for(int i = 0; i <= this.top; i++){
            System.out.println(this.stackArray[i]);
        }
    }

    public void printFromTop(){
        for(int i = this.top; i >= 0; i--){
            System.out.println(this.stackArray[i]);
        }
    }
//--------------------------------------------------------------
} // end class StackS
