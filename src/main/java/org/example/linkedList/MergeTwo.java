package org.example.linkedList;

public class MergeTwo {
    /**
     * 合并两个有序链表
     *
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode n9 = new ListNode(9, null);
        ListNode n7 = new ListNode(7, n9);
        ListNode n5 = new ListNode(5, n7);
        ListNode n3 = new ListNode(3, n5);
        ListNode n1 = new ListNode(1, n3);

        ListNode n10 = new ListNode(10, null);
        ListNode n8 = new ListNode(8, n10);
        ListNode n6 = new ListNode(6, n8);
        ListNode n4 = new ListNode(4, n6);
        ListNode n2 = new ListNode(2, n4);

        System.out.println(mergeTwoLists(n1, n2));

    }
}
