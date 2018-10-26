import java.util.Arrays;

public class StackArray {

    private int size;
    private int[] array;
    private int top;

    //конструктор, принимающий размер s
    public StackArray (int s) {
        size = s; //size of array
        array = new int[size]; //create an array
        top = -1; // isEmpty
    }

    //create a method isEmpty

    public boolean isEmpty() {
        return (top == -1); // true if top = -1
    }

    //create a method overflow
    public boolean overflow() {
        return (top == -1+size);
    }

    // create a method to add element (push)
    public void push (int a) {
        if (overflow()) {
            System.out.println("Stack is full");
            return;
        } else {
            top = top + 1;
            array[top] = a;
            System.out.println("Top is " + top);
        }
    }

    //create a method to remove element (pop)
    public int pop () {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            System.out.println("Top is " + top);
            int i = top;
            top = top-1;
            return array[i];
        }
    }

    //create a method "pick"
    public int pick(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            System.out.println("Top is " + top);
            return array[top];
        }
    }

    //create a method "size"
    public int sizeOfStack () {
        int sizeOfStack = top + 1;
        System.out.println("Size of stack " + sizeOfStack);
        return sizeOfStack;
    }

    //create a method toString
    public void PrintStack() {
        if (!isEmpty()) {
            //bla-bla
        }
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        System.out.println(stack.top);
                stack.push(5);
                stack.push(2);
                stack.push(1);
                stack.push(3);
                stack.push(7);



       System.out.println(stack.pick());

        stack.pop();
        stack.pop();

        System.out.println(stack.sizeOfStack());


    }
}
