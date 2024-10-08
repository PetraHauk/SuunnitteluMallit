package Strategy;

public class BubbleSort implements SortStrategy{

    @Override
    public void sort(int[] arr) {
        // Bubble sort
        // Vertaillaan jokaista alkiota sen vieressä olevaan alkioon ja vaihdetaan ne keskenään,
        // jos ne ovat väärässä järjestyksessä
        // Toistetaan tätä kunnes koko taulukko on järjestyksessä

        int n = arr.length;
        // Ulkoinen silmukka käy läpi taulukon alkiot
        // Viimeinen alkio jää pois, koska se on jo järjestyksessä
        for (int i = 0; i < n - 1; i++) {
            // Sisäinen silmukka käy läpi taulukon alkiot
            for (int j = 0; j < n - i - 1; j++) {
                // Ja vertailee jokaista alkiota sen vieressä olevaan alkioon
                if (arr[j] > arr[j + 1]) { // Jos alkio on suurempi kuin seuraava alkio
                    int temp = arr[j]; // Tallenna alkio
                    arr[j] = arr[j + 1]; // Vaihda alkio seuraavaan
                    arr[j + 1] = temp; // Vaihda seuraava alkio alkioon
                }
            }
        }
    }
}
