package tasks.easy;

public class MergeTwoSortedLists21 {

    public static LinkedListNode mergeTwoLists(LinkedListNode list1, LinkedListNode list2) {
        LinkedListNode dummy = new LinkedListNode();
        LinkedListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(4);
        LinkedListNode node4 = new LinkedListNode(1);
        LinkedListNode node5 = new LinkedListNode(3);
        LinkedListNode node6 = new LinkedListNode(4);
        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
        node5.next = node6;
        LinkedListNode currNode = mergeTwoLists(node1, node4);
        while (currNode != null) {
            System.out.println(currNode.val);
            currNode = currNode.next;
        }
    }

}