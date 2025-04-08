public class Stack {


    private int[] stack;
    private int maxSize;    //size
    private int top;    //index

    public Stack(int size) {
        this.maxSize=size;
        this.stack = new int[maxSize];
        this.top = -1;

    }

    public void push(int x) {

        if(isFull()) {
            System.out.println("Stack is full " + x);
        }
        stack[++top] = x;
        System.out.println(x+ "stack pushed");

    }

    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    public void printStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        for(int i=top; i>=0; i--) {
            System.out.print(stack[i]+" ");
        }
    }

    public boolean isFull() {
        return top == maxSize-1;
    }

    public boolean isEmpty() {
        return top == -1;
    }


}
