import addtwonumbers.AddTwoNumbers;
import addtwonumbers.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {
    @Test
    @DisplayName("V1.0")
    void test() {
        ListNode first_1 = new ListNode(2);
        ListNode second_1 = new ListNode(4);
        ListNode thirdly_1 = new ListNode(3);
        first_1.setNext(second_1);
        second_1.setNext(thirdly_1);

        ListNode first_2 = new ListNode(5);
        ListNode second_2 = new ListNode(6);
        ListNode thirdly_2 = new ListNode(4);
        first_2.setNext(second_2);
        second_2.setNext(thirdly_2);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode = addTwoNumbers.addTwoNumbers(first_1, first_2);

        StringJoiner sj = new StringJoiner(" -> ");
        while (null != listNode) {
            sj.add(((Integer) listNode.getVal()).toString());
            listNode = listNode.getNext();
        }

        assertEquals("7 -> 0 -> 8", sj.toString());
    }


    @Test
    @DisplayName("V1.0")
    void test_1() {
        ListNode first_1 = new ListNode(9);

        ListNode first_2 = new ListNode(1);
        ListNode second_2 = new ListNode(9);
        ListNode thirdly_2 = new ListNode(9);
        first_2.setNext(second_2);
        second_2.setNext(thirdly_2);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode = addTwoNumbers.addTwoNumbers(first_1, first_2);

        StringJoiner sj = new StringJoiner(" -> ");
        while (null != listNode) {
            sj.add(((Integer) listNode.getVal()).toString());
            listNode = listNode.getNext();
        }

        assertEquals("0 -> 0 -> 0 -> 1", sj.toString());
    }

}
