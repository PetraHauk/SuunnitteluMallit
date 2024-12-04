package Iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int prev = 0;
    private int curr = 1;

    public boolean hasNext() {
        return true;
    }

    public Integer next() {
        int next = prev + curr;
        prev = curr;
        curr = next;
        return prev;
    }
}
