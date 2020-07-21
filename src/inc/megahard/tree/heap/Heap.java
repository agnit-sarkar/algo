package inc.megahard.tree.heap;

import java.util.ArrayList;

public abstract class Heap<T> {
    ArrayList<T> items;
    protected int capacity = 10;
    boolean fixedSize;


    public Heap() {
        items = new ArrayList<>(capacity);
    }

    public Heap(int capacity) {
        this.capacity = capacity;
        fixedSize = true;
        items = new ArrayList<>(capacity);
    }

    public T getParent(int index) {
        return items.get(getParentIndex(index));
    }

    public T getLeftChild(int index) {
        return items.get(getLeftChildIndex(index));
    }

    public T getRightChild(int index) {
        return items.get(getRightChildIndex(index));
    }

    public boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    public boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < items.size();
    }

    public boolean hasRightChild(int index) {
        return getRightChildIndex(index) < items.size();
    }

    protected int getLeftChildIndex(int parentIndex) {
        return parentIndex * 2 + 1;
    }

    protected int getRightChildIndex(int parentIndex) {
        return parentIndex * 2 + 2;
    }

    protected int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    protected void ensureCapacity() {
        if (items.size() == capacity) {
            items.ensureCapacity(capacity);
        }
    }

    protected void swap(int indexOne, int indexTwo) {
        T item = items.get(indexOne);
        items.set(indexOne, items.get(indexTwo));
        items.set(indexTwo, item);
    }

    abstract public T peek() throws IllegalStateException;
    abstract public T poll() throws IllegalStateException;
    abstract public void add(T item);
}
