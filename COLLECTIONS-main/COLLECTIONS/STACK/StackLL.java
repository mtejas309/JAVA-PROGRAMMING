//FUNCTIONS OF STACK IN LINKEDLIST
//PUSH
//ISEMPTY
//POP
//PEEK
public class StackLL {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        private Node head = null;

        public void push(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public boolean isEmpty() {
            return head == null;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return -1; // Indicate stack underflow
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // Indicate stack is empty
            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
