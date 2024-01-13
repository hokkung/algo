package org.example.linkedlist;


import org.example.common.ListNode;

public class ReverseListImpl implements ReverseList {
    @Override
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
