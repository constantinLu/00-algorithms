package Algorithms;

public class _2insertionSort {

    public static int[] insertionSort(int[] arr) {

        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {


        int[] arr1 = {99, 88, 55, 66, 44, 22, 11, 33, 1};
        int[] arr2 = insertionSort(arr1);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");

        }
    }
}
