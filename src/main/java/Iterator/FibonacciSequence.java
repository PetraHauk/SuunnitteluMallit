package Iterator;

import java.util.Iterator;

public class FibonacciSequence implements Sequence{

    public Iterator<Integer> iterator() {
        FibonacciIterator iterator = new FibonacciIterator();
        return iterator;
    }

    public Integer get(int n) {
        Iterator<Integer> iterate = iterator();
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = iterate.next();
            System.out.println(result);
        }
        return result;
    }

}
