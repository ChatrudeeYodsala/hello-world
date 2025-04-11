public class NumberSorter {

    // Method to sort an array in ascending order
    public static void sortAscending(double[] numbers) {
        int n = numbers.length;
        boolean swapped;

        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j + 1]
                    double temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in inner loop, array is sorted
            if (!swapped) break;
        }
    }

    // Method to print the array
    public static void printArray(double[] numbers) {
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        double[] numbers = {5.5, 1.1, 4.4, 3.3};

        System.out.println("Before sorting:");
        printArray(numbers);

        sortAscending(numbers);

        System.out.println("After sorting:");
        printArray(numbers);
    }
}
