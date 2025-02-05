package com.java.linkedList;



class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class removeElement {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        // Traverse the list
        while (current.next != null) {
            if (current.next.val == val) {
                // Remove the node
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return dummy.next; // Return the new head
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        // Value to remove
        int valToRemove = 6;

        // Create a removeElement object and remove elements
        removeElement solution = new removeElement();
        ListNode newHead = solution.removeElements(head, valToRemove);

        // Print the resulting linked list
        printList(newHead);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

