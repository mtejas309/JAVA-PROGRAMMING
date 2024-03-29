//QUEUE USING LL
public class QueueLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    class Queue {
        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                tail = head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = head.data;
            // single node
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String args[]) {
        QueueLL queueB = new QueueLL();
        Queue q = queueB.new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
