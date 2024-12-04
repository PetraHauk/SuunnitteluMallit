package Iterator;

public class Main {
    public static void main(String[] args) {
        Sequence sequence = new FibonacciSequence();

        sequence.get(10);
    }

    // The state (prev and curr values) is stored in the iterator
    // to ensure each iterator maintains its own independent state.

    // The Sequence interface provides a method to get the nth element
    // by creating a new iterator and delegating the task of generating Fibonacci numbers to it.

    // If the state was stored in the Sequence class,
    // problems would arise when multiple iterators are created.
    // Each iterator would share the same state, leading to incorrect results.
}
