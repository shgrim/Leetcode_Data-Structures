package Leetcode;

    // Java code to rearrange linked list in place
    /*class Geeks {

        static class Node {
            int data;
            Node next;
        }

        // function for rearranging a linked list
        // with high and low value.
        static Node rearrange(Node head)
        {
            if (head == null) // Base case.
                return null;

            // two pointer variable.
            Node prev = head, curr = head.next;

            while (curr != null) {
                // swap function for swapping data.
                if (prev.data > curr.data) {
                    int t = prev.data;
                    prev.data = curr.data;
                    curr.data = t;
                }

                // swap function for swapping data.
                if (curr.next != null
                        && curr.next.data > curr.data) {
                    int t = curr.next.data;
                    curr.next.data = curr.data;
                    curr.data = t;
                }

                prev = curr.next;

                if (curr.next == null)
                    break;
                curr = curr.next.next;
            }
            return head;
        }

        // function to insert a Node in
        // the linked list at the beginning.
        static Node push(Node head, int k)
        {
            Node tem = new Node();
            tem.data = k;
            tem.next = head;
            head = tem;
            return head;
        }

        // function to display Node of linked list.
        static void display(Node head)
        {
            Node curr = head;
            while (curr != null) {
                System.out.printf("%d ", curr.data);
                curr = curr.next;
            }
        }

        // Driver code
        public static void main(String args[])
        {

            Node head = null;

            // let create a linked list.
            // 9 . 6 . 8 . 3 . 7
            head = push(head, 16);
            head = push(head, 24);
            head = push(head, 28);
            head = push(head, 32);
            head = push(head, 36);
            head = push(head, 40);
            head = push(head, 44);
            head = push(head, 48);

            head = rearrange(head);

            display(head);
        }
    }*/

// This code is contributed by Arnab Kundu
// Java program to rearrange link list in place

// Linked List Class
class Leetcode143 {

    static Node head; // head of the list

    /* Node Class */
    static class Node {

        int data;
        Node next;

        // Constructor to create a new node
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void printlist(Node node)
    {
        if (node == null) {
            return;
        }
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
    }

    Node reverselist(Node node)
    {
        Node prev = null, curr = node, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    void rearrange(Node node)
    {

        // 1) Find the middle point using tortoise and hare
        // method
        Node slow = node, fast = slow.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2) Split the linked list in two halves
        // node1, head of first half 1 -> 2 -> 3
        // node2, head of second half 4 -> 5
        Node node1 = node;
        Node node2 = slow.next;
        slow.next = null;

        // 3) Reverse the second half, i.e., 5 -> 4
        node2 = reverselist(node2);

        // 4) Merge alternate nodes
        node = new Node(0); // Assign dummy Node

        // curr is the pointer to this dummy Node, which
        // will be used to form the new list
        Node curr = node;
        while (node1 != null || node2 != null) {

            // First add the element from first list
            if (node1 != null) {
                curr.next = node1;
                curr = curr.next;
                node1 = node1.next;
            }

            // Then add the element from second list
            if (node2 != null) {
                curr.next = node2;
                curr = curr.next;
                node2 = node2.next;
            }
        }

        // Assign the head of the new list to head pointer
        node = node.next;
    }

    public static void main(String[] args)
    {

        Leetcode143 list = new Leetcode143();
        list.head = new Node(16);
        list.head.next = new Node(24);
        list.head.next.next = new Node(28);
        list.head.next.next.next = new Node(32);
        list.head.next.next.next.next = new Node(36);
        list.head.next.next.next.next.next = new Node(40);
        list.head.next.next.next.next.next.next = new Node(44);
        list.head.next.next.next.next.next.next.next = new Node(48);

        list.printlist(head); // print original list
        list.rearrange(head); // rearrange list as per ques
        System.out.println("");
        list.printlist(head); // print modified list
    }
}

// This code has been contributed by Mayank Jaiswal



