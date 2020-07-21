package inc.megahard.tree.heap;

public class MinHeap extends Heap<Integer>{

    public MinHeap() {
    }

    public MinHeap(int capacity) {
        super(capacity);
    }

    @Override
    public Integer peek() throws IllegalStateException {
        if (items.isEmpty()) throw new IllegalStateException();
        return items.get(0);
    }

    @Override
    public Integer poll() throws IllegalStateException {
        if (items.isEmpty()) throw new IllegalStateException();
        Integer item  =  items.get(0);
        items.set(0, items.get(items.size() - 1));
        items.remove(items.size() - 1);
        heapifyDown();
        return item;
    }

    @Override
    public void add(Integer item) {
        //ensureCapacity();
        items.add(item);
        heapifyUp();
        if (fixedSize && items.size() > capacity) {
            poll();
        }
    }

    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && getRightChild(index) < getLeftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }
            if (items.get(smallerChildIndex) > items.get(index)) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    private void heapifyUp() {
        int index = items.size() - 1;
        while (hasParent(index) && getParent(index) > items.get(index)) {
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }
}
