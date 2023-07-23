// Question 6: Remove Duplicates from Linked-List

// Skill Mapping: Intermediate

// Description: Consider a Linked-List with N number of repeated integers in Data-Node.

// Task - WAP in Java to remove the repeated integer numbers from Linked-List.

// Sample input: Linked-List:- 2->5->12->2->3->5->1->2->5->5

// Output:- 2->5->12->3->1

package assessment2;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicatesLinkedList {
    Node head;

    public void removeDuplicates() {
        if (head == null) {
            return;
        }

        Node current = head;

        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    // Duplicate found, remove the node
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveDuplicatesLinkedList list = new RemoveDuplicatesLinkedList();
        list.head = new Node(2);
        list.head.next = new Node(5);
        list.head.next.next = new Node(12);
        list.head.next.next.next = new Node(2);
        list.head.next.next.next.next = new Node(3);
        list.head.next.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next.next = new Node(1);
        list.head.next.next.next.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next.next.next.next.next = new Node(5);

        System.out.print("Original Linked List: ");
        list.printLinkedList();

        list.removeDuplicates();

        System.out.print("Linked List after removing duplicates: ");
        list.printLinkedList();
    }
}
