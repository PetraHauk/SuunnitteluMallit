package Strategy;

public class QuickSort implements SortStrategy{

    @Override
    public void sort(int[] arr) {
        // Quick sort
        // Valitaan pivot-alkio ja järjestetään taulukko siten,
        // että kaikki pienemmät alkiot ovat pivot-alkiota ennen ja suuremmat sen jälkeen
        // Tämän jälkeen järjestetään rekursiivisesti osataulukot

        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Pilkotaan taulukko kahtia ja järjestetään osataulukot numeroiden suuruuden mukaan
            int parindex = partition(arr, low, high);

            // Järjestetään osataulukot rekursiivisesti
            quickSort(arr, low, parindex - 1);
            quickSort(arr, parindex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // Valitaan pivot-elementiksi taulukon viimeinen alkio
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Jos nykyinen alkio on pienempi tai yhtä suuri kuin pivot-alkio
            if (arr[j] <= pivot) {
                i++; // Kasvatetaan i:tä
                // Vaihdetaan arr[i] ja arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Vaihdetaan pivot-alkio ja arr[i + 1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
