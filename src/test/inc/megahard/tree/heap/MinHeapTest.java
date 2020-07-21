package test.inc.megahard.tree.heap;

import inc.megahard.tree.heap.MinHeap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {

    MinHeap minHeap = new MinHeap();
    MinHeap minHeapFixed = new MinHeap(3);

    @BeforeEach
    void setup() {
        Integer[] items = {7, 6, 45, 32, 8, 11, 23, 5, 42};
        for (Integer item:
             items) {
            minHeap.add(item);
        }

        for (Integer item:
                items) {
            minHeapFixed.add(item);
        }
    }

    @Test
    void peek() {
        Integer root = minHeap.peek();
        assertEquals(root, 5);
    }

    @Test
    void poll() {
        Integer root = minHeap.poll();
        assertEquals(root, 5);

        root = minHeap.poll();
        assertEquals(root, 6);

        root = minHeap.poll();
        assertEquals(root, 7);
    }

    @Test
    void fixedHeap_returns3rdMin() {
        Integer root = minHeapFixed.peek();
        assertEquals(32, root);
    }
}