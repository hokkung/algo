package org.example.linkedlist;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateFromListImplTest {

    private RemoveDuplicateFromListImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new RemoveDuplicateFromListImpl();
    }

    @Test
    void deleteDuplicates() {
        ListNode expect = new ListNode(1, new ListNode(2, new ListNode(3, null)));

        ListNode res = underTest.deleteDuplicates( new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, null)))));

        while (res != null) {
            Assertions.assertEquals(expect.getVal(), res.getVal());
            res = res.getNext();
            expect = expect.getNext();
        }
    }
}