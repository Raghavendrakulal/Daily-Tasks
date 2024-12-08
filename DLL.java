
class Node {
    int data;
    Node prev; 
    Node next; 

    
    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


class DoublyLinkedList {
    private Node head; 

    // Add a node at the end
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) { // Traverse to the end
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Add a node at the beginning
    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;

        // Traverse to find the node to delete
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node with data " + data + " not found");
            return;
        }

        // Update references to delete the node
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else { // Node to be deleted is the head
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        System.out.println("Node with data " + data + " deleted");
    }

    // Display 
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(10);
        dll.append(20);
        dll.append(30);
        dll.display();

        dll.prepend(5);
        dll.display();

        dll.delete(20);
        dll.display();

        dll.delete(50); 
    }
}
