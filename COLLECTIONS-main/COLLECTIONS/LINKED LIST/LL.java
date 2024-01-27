//FUNCTIONS OF LINKED LIST
//ADD FIRST
//ADD LAST
//PRINT LIST
//REMOVE FIRST
//REMOVE LAST
//GET SIZE
//ADD IN MIDDLE
public class LL {

    private Node head;
    private int size;

    public LL() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //ADD FIRST

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    //ADD LAST

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
        size++;
    }

     //PRINT LIST
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

     ////REMOVE FIRST
    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        head = head.next;
        size--;
    }
//REMOVE LAST
    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null;
    }
//GET SIZE
    public int getSize() {
        return size;
    }

    //ADD IN MIDDLE

 public void addInMiddle(int index, String data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;

        Node newNode = new Node(data);

        if (head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currNode = head;
        for (int i = 1; i < size; i++) {
            if (i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }
    public static void main(String args[]) {
        LL list = new LL();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();
    }
}
