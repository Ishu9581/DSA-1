// Question 5: Merge and Sort the elements in two Linked-List

// Skill Mapping: Intermediate

// Description: Consider two Linked-List with N number of integers in Data-Node respectively.

// Task 1- WAP in Java to merge both Linked-Lists.

// Task 2 - Sort the output Linked-List basis of its Data-Node in ascending order.

// Sample input: Linked-List-1:- 25->35->12->4->36->48

// Linked-List-2:- 8->32->22->45->63->49

// Output:- 4->8->12->22->25->32->35->36->45->48->49->63


package assessment;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortLinkedList {
    Node head;

    public void mergeSortedLinkedLists(Node list1, Node list2) {
        Node mergedList = new Node(-1); // Dummy node for the merged list
        Node current = mergedList;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Connect the remaining elements of list1 or list2, if any
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        head = mergedList.next; // Set the head of the merged list
    }

    public void sortLinkedList() {
        head = mergeSort(head);
    }

    private Node mergeSort(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node middle = getMiddle(node);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(node);
        Node right = mergeSort(nextOfMiddle);

        return merge(left, right);
    }

    private Node getMiddle(Node node) {
        if (node == null) {
            return node;
        }

        Node slow = node;
        Node fast = node.next;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        return slow;
    }

    private Node merge(Node left, Node right) {
        Node result = null;

        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        }

        if (left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
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
        MergeSortLinkedList mergedList = new MergeSortLinkedList();

        Node list1 = new Node(25);
        list1.next = new Node(35);
        list1.next.next = new Node(12);
        list1.next.next.next = new Node(4);
        list1.next.next.next.next = new Node(36);
        list1.next.next.next.next.next = new Node(48);

        Node list2 = new Node(8);
        list2.next = new Node(32);
        list2.next.next = new Node(22);
        list2.next.next.next = new Node(45);
        list2.next.next.next.next = new Node(63);
        list2.next.next.next.next.next = new Node(49);

        mergedList.mergeSortedLinkedLists(list1, list2);
        mergedList.sortLinkedList();

        System.out.print("Merged and Sorted LinkedList: ");
        mergedList.printLinkedList();
    }
}
