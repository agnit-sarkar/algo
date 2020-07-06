package inc.megahard.LinkedList;

public class LinkedList {
    ListNode mFirst;
    private int count;

    public void addToTail(int data) {
        ListNode node = new ListNode(data);
        if (mFirst == null) {
            mFirst = node;
            return;
        }

        ListNode current = mFirst;
        while (current.next != null){
            current = current.next;
        }
        current.next= node;
    }

    public void printList() {
        ListNode current = mFirst;
        while (current != null){
            System.out.print(current.data + " ==> ");
            current = current.next;
        }
        System.out.print("\b\b\b\b");
        System.out.println();
    }

    public void deleteItem(int item) {
        if (mFirst == null)
            return;

        if (mFirst.data == item) {
            mFirst = mFirst.next;
            return;
        }

        ListNode current = mFirst.next;
        ListNode previous = mFirst;
        while (current != null){
            if (current.data == item) {
                previous.next = current.next;
            }
            previous = current;
            current = current.next;
        }
    }

    public ListNode getKthFromLast(int k) {
        int count;
        return getKthFromLast(mFirst, k);
    }

    public ListNode getKthFromLast(ListNode head, int k) {
        if(head == null)
            return null;

        ListNode node = getKthFromLast(head.next, k);
        count = count + 1;
        if (count == k) {
            return head;
        }
        return node;
    }

    public void divide(int item) {
        ListNode beforeStart= null;
        ListNode afterStart = null;
        ListNode current = mFirst;
        while(current != null) {
            ListNode next = current.next;
            if (current.data < item) {
                current.next = beforeStart;
                beforeStart = current;
            } else {
                current.next = afterStart;
                afterStart = current;
            }
            current = next;
        }

        if (beforeStart == null) {
            mFirst = afterStart;
        }

        mFirst = beforeStart;
        while (beforeStart.next != null) {
            beforeStart = beforeStart.next;
        }
        beforeStart.next = afterStart;
    }
}
