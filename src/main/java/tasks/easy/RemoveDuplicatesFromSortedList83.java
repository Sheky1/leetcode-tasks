package tasks.easy;

public class RemoveDuplicatesFromSortedList83 {

    public static LinkedListNode deleteDuplicates(LinkedListNode head) {
        LinkedListNode currNode = head;
        while(currNode != null) {
            while(currNode.next != null && currNode.val == currNode.next.val) {
                currNode.next = currNode.next.next;
            }
            currNode = currNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(1);
        LinkedListNode node3 = new LinkedListNode(2);
        LinkedListNode node4 = new LinkedListNode(3);
        LinkedListNode node5 = new LinkedListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        LinkedListNode currNode = deleteDuplicates(node1);
        while (currNode != null) {
            System.out.println(currNode.val);
            currNode = currNode.next;
        }
    }
}

class LinkedListNode {
    int val;
    LinkedListNode next;

    LinkedListNode() {
    }

    LinkedListNode(int val) {
        this.val = val;
    }

    LinkedListNode(int val, LinkedListNode next) {
        this.val = val;
        this.next = next;
    }
}