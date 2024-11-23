public class DoublyLinkedList {

    static class ListNode {
        int data;
        ListNode next;
        ListNode prev;

        //
        public ListNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // 
    private ListNode head;
    private ListNode tail;

    
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    // Insert a node at the end of the list
    public void insert(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) { // If list is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Delete a node from the front of the list
    public void delete() {
        if (head == null) { // If list is empty
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head == tail) { // If only one element exists
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Display all elements in the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        ListNode current = head;
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

   
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.display(); 

        
        dll.delete();
        dll.display();

        dll.delete();
        dll.display(); 

        dll.delete();
        dll.display(); 
    }
}
