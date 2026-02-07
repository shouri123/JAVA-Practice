import java.util.*;

// OOP makes DSA simpler by:
// 1. Encapsulation - Hide complex logic inside methods
// 2. Reusability - Create object and use anywhere
// 3. Clean Code - No need to manage array indexes manually

class Stack {
    // Private data - Encapsulation
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor - Initialize the stack
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push element
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = value;
        System.out.println("Pushed: " + value);
    }

    // Pop element
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }

    // Peek top element
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    // Check if empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Main class to test
class StackOOP {
    public static void main(String[] args) {
        // Create stack object - so simple!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int n = sc.nextInt();
        Stack stack = new Stack(n);

        // Use methods - no need to manage array manually
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());

        stack.display();

        // You can create multiple stacks easily!
        Stack anotherStack = new Stack(3);
        anotherStack.push(100);
        anotherStack.push(200);
        anotherStack.display();
        sc.close();
    }
}
