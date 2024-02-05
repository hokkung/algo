package org.example.linkedlist;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleImplTest {
    private LinkedListCycleImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new LinkedListCycleImpl();
    }

    @Test
    void hasCycle() {
        ListNode n5 = new ListNode(5, null);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);

        Assertions.assertFalse(underTest.hasCycle(n3));

        ListNode n0 = new ListNode(0, null);
        ListNode n2 = new ListNode(2, n0);
        ListNode n1 = new ListNode(1, n2);
        n0.setNext(n1);

        Assertions.assertTrue(underTest.hasCycle(n0));
    }
}