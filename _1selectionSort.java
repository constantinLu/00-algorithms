package Algorithms;

public class _1selectionSort {

    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j; // looking for the smallest;
                }
            }
            // if smallest found swap
            int smallestNumber = array[index];
            array[index] = array[i];
            array[i] = smallestNumber;
        }
        return array;
    }


    public static void main(String[] args) {

        int[] arr1 = {99, 88, 55, 66, 44, 22, 11, 33, 1};
        int[] arr2 = selectionSort(arr1);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");

        }
    }
}
