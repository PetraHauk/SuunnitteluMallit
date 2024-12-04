package Iterator;

import java.util.Iterator;

interface Sequence {
    Iterator<Integer> iterator();

    Integer get(int n);
}
