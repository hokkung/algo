package org.example.linkedlist;

import org.example.common.ListNode;

public class MergeTwoSortedListImpl implements MergeTwoSortedList {
    @Override
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode cur = new ListNode();
        ListNode head = cur;

        while (c1 != null || c2 != null) {
            if (c1 != null && c2 != null) {
                if (c1.getVal() < c2.getVal()) {
                    cur.setNext(c1);
                    cur = cur.getNext();
                    c1 = c1.getNext();
                } else {
                    cur.setNext(c2);
                    cur = cur.getNext();
                    c2 = c2.getNext();
                }
            } else if (c1 != null) {
                cur.setNext(c1);
                cur = cur.getNext();
                c1 = c1.getNext();
            } else if (c2 != null) {
                cur.setNext(c2);
                cur = cur.getNext();
                c2 = c2.getNext();
            }
        }

        return head.getNext();
    }
}
