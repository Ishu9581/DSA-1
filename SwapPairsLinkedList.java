Question 11: Swap Nodes in Pairs

Skill Mapping: Basic

Description: Solve the LeetCode Problem given as a link below -

https://leetcode.com/problems/swap-nodes-in-pairs/





package assessment3;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class SwapPairsLinkedList {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null && head.next != null) {
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            // Swapping the nodes
            prev.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            // Move pointers ahead
            prev = firstNode;
            head = firstNode.next;
        }

        return dummy.next;
    }

    // Helper function to create a linked list from an array
    public ListNode createLinkedList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }

    // Helper function to print the linked list
    public void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SwapPairsLinkedList solution = new SwapPairsLinkedList();

        // Example 1
        int[] arr1 = {1, 2, 3, 4};
        ListNode head1 = solution.createLinkedList(arr1);
        System.out.println("Original linked list:");
        solution.printLinkedList(head1);
        ListNode swapped1 = solution.swapPairs(head1);
        System.out.println("Swapped linked list:");
        solution.printLinkedList(swapped1);

        // Example 2
        int[] arr2 = {};
        ListNode head2 = solution.createLinkedList(arr2);
        System.out.println("Original linked list:");
        solution.printLinkedList(head2);
        ListNode swapped2 = solution.swapPairs(head2);
        System.out.println("Swapped linked list:");
        solution.printLinkedList(swapped2);

        // Example 3
        int[] arr3 = {1};
        ListNode head3 = solution.createLinkedList(arr3);
        System.out.println("Original linked list:");
        solution.printLinkedList(head3);
        ListNode swapped3 = solution.swapPairs(head3);
        System.out.println("Swapped linked list:");
        solution.printLinkedList(swapped3);
    }
}
