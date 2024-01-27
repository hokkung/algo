package org.example.linkedlist;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListImplTest {
    private MergeTwoSortedListImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new MergeTwoSortedListImpl();
    }

    @Test
    void mergeTwoLists() {
        ListNode c12 = new ListNode(2, null);
        ListNode c11 = new ListNode(1, c12);
        ListNode c21 = new ListNode(5, null);

        ListNode actual = underTest.mergeTwoLists(c11, c21);

        int[] expected = new int[] {1, 2, 5};
        int i = 0;
        while (actual != null) {
            Assertions.assertEquals(expected[i], actual.getVal());
            i++;
            actual = actual.getNext();
        }
    }
}