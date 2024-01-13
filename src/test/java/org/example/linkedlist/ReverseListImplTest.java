package org.example.linkedlist;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseListImplTest {
    private ReverseListImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new ReverseListImpl();
    }

    @Test
    void reverseList() {
        ListNode node3 = new ListNode(3, null);
        ListNode node2 = new ListNode(2, node3);
        ListNode node = new ListNode(1, node2);

        ListNode rNode = new ListNode(1, null);
        ListNode rNode2 = new ListNode(2, rNode);
        ListNode rNode3 = new ListNode(3, rNode2);

        ListNode result = underTest.reverseList(node);

        while (result.getNext() != null) {
            Assertions.assertEquals(rNode3.getVal(), result.getVal());
            rNode3 = rNode3.getNext();
            result = result.getNext();
        }
    }

    @Test
    void reverseList2() {
        Assertions.assertEquals(null, underTest.reverseList(null));
    }
}