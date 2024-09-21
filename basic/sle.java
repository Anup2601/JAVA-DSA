
public class sle {
    public static void main(String[] args) {
        int[] array = {80, 10, 29, 11, 8, 30, 15};
        int n = array.length;

        System.out.println("Before sorting array elements are - ");
        printArray(array);

        selectionSort(array, n);

        System.out.println("\nAfter sorting array elements are - ");
        printArray(array);
    }

    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}