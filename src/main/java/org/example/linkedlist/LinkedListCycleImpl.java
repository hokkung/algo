package org.example.linkedlist;

import org.example.common.ListNode;

public class LinkedListCycleImpl implements LinkedListCycle {
    @Override
    public boolean hasCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.getNext() != null) {
            s = s.getNext();
            f = f.getNext().getNext();

            if (s.equals(f)) {
                return true;
            }

        }
        return false;
    }
}
