package test.inc.megahard.tree.heap;

import inc.megahard.tree.heap.MaxHeap;
import inc.megahard.tree.heap.MinHeap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxHeapTest {

    MaxHeap maxHeap = new MaxHeap();
    MaxHeap maxHeapFixed = new MaxHeap(3);

    @BeforeEach
    void setup() {
        Integer[] items = {7, 6, 45, 32, 8, 11, 23, 5, 42};
        for (Integer item:
                items) {
            maxHeap.add(item);
        }

        for (Integer item:
                items) {
            maxHeapFixed.add(item);
        }
    }

    @Test
    void peek() {
        Integer root = maxHeap.peek();
        assertEquals(root, 45);
    }

    @Test
    void poll() {
        Integer root = maxHeap.poll();
        assertEquals(root, 45);

        root = maxHeap.poll();
        assertEquals(root, 42);

        root = maxHeap.poll();
        assertEquals(root, 32);
    }

    @Test
    void fixedHeap_returns3rdMax() {
        Integer root = maxHeapFixed.peek();
        assertEquals(7, root);
    }
}