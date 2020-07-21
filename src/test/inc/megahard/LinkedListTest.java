package test.inc.megahard;

import inc.megahard.linkedList.LinkedList;
import inc.megahard.linkedList.ListNode;
import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    void addToTail() {
        LinkedList linkedList =  new LinkedList();
        linkedList.addToTail(50);
        linkedList.addToTail(11);
        linkedList.addToTail(40);
        linkedList.addToTail(76);
        linkedList.addToTail(36);

        linkedList.printList();

        linkedList.divide(40);

        linkedList.printList();
    }

    @Test
    void deleteItem() {
        LinkedList linkedList =  new LinkedList();
        linkedList.addToTail(1);
        linkedList.addToTail(2);
        linkedList.addToTail(3);
        linkedList.addToTail(4);

        System.out.println("Test Delete");
        linkedList.printList();

        linkedList.deleteItem(1);
        linkedList.printList();

        linkedList.deleteItem(3);
        linkedList.printList();

        linkedList.deleteItem(4);
        linkedList.printList();

        linkedList.deleteItem(2);
        linkedList.printList();
    }

    @Test
    void getKthFromLast() {
        LinkedList linkedList =  new LinkedList();
        linkedList.addToTail(1);
        linkedList.addToTail(2);
        linkedList.addToTail(3);
        linkedList.addToTail(4);

        linkedList.printList();

        ListNode node = linkedList.getKthFromLast(2);

        System.out.println("2 nd form last node : " + node.data);
    }

    @Test
    void divide() {
        LinkedList linkedList =  new LinkedList();
        linkedList.addToTail(50);
        linkedList.addToTail(11);
        linkedList.addToTail(40);
        linkedList.addToTail(76);
        linkedList.addToTail(36);

        linkedList.printList();

        linkedList.divide(40);

        linkedList.printList();
    }
}