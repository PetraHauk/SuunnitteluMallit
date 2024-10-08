package Strategy;

public class SelectionSort implements SortStrategy {

    public void sort(int[] arr) {
        // Selection sort
        // Löydetään pienin alkio ja vaihdetaan se ensimmäiseksi
        // Toistetaan tätä prosessia kunnes koko taulukko on järjestyksessä

        int n = arr.length;
        // Käy läpi kaikki paitsi viimeinen alkio
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the smallest
            for (int j = i + 1; j < n; j++) { // Compare with the rest of the array
                if (arr[j] < arr[minIndex]) { // If a smaller element is found
                    minIndex = j; // Update the index of the smallest element
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex]; // Tallenna pienin alkio
            arr[minIndex] = arr[i]; // Vaihda pienin alkio ensimmäiseksi
            arr[i] = temp; // Vaihda ensimmäinen alkio pienimmäksi
        }
    }
}
