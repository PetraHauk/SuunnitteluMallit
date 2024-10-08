package Strategy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int smallSize = 30;
        int largeSize = 100000;

        int[] smallArr = generateRandomArray(smallSize);
        int[] largeArr = generateRandomArray(largeSize);

        System.out.println("Small array:");

        System.out.println("Bubble sort:");
        meassurePerformance(smallArr.clone(), new BubbleSort());

        System.out.println("Selection sort:");
        meassurePerformance(smallArr.clone(), new SelectionSort());

        System.out.println("Quick sort:");
        meassurePerformance(smallArr.clone(), new QuickSort());

        System.out.println("Large array:");

        System.out.println("Bubble sort:");
        meassurePerformance(largeArr.clone(), new BubbleSort());

        System.out.println("Selection sort:");
        meassurePerformance(largeArr.clone(), new SelectionSort());

        System.out.println("Quick sort:");
        meassurePerformance(largeArr.clone(), new QuickSort());
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size * 10);
        }
        return arr;
    }

    private static void meassurePerformance(int[] arr, SortStrategy strategy) {
        long startTime = System.currentTimeMillis();
        strategy.sort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}
