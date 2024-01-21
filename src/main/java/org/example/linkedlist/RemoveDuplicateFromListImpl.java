package org.example.linkedlist;

import org.example.common.ListNode;

public class RemoveDuplicateFromListImpl implements RemoveDuplicateFromList {
    @Override
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;

        while (cur != null) {
            while (cur.getNext() != null && cur.getNext().getVal() == cur.getVal()) {
                cur.setNext(cur.getNext().getNext());
            }
            cur = cur.getNext();
        }

        return head;
    }
}
