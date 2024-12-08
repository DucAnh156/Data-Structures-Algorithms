package Sort;
import java.util.Random;

public class Sort {

    // Bubble Sort Implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, the array is sorted
            if (!swapped) break;
        }
    }

    // Selection Sort Implementation
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Generate a large array of random integers
        int arraySize = 10000; // Size of the array
        int[] randomArray = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            randomArray[i] = random.nextInt(10000); // Random integers between 0 and 9999
        }

        // Measure time for Bubble Sort
        int[] bubbleArray = randomArray.clone(); // Clone to keep original data
        long startTime = System.nanoTime();
        bubbleSort(bubbleArray);
        long bubbleTime = System.nanoTime() - startTime;

        // Measure time for Selection Sort
        int[] selectionArray = randomArray.clone(); // Clone to keep original data
        startTime = System.nanoTime();
        selectionSort(selectionArray);
        long selectionTime = System.nanoTime() - startTime;

        // Output the results
        System.out.printf("Bubble Sort Time: %.6f seconds%n", bubbleTime / 1_000_000_000.0);
        System.out.printf("Selection Sort Time: %.6f seconds%n", selectionTime / 1_000_000_000.0);
    }
}