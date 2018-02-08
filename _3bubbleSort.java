package Algorithms;

public class _3bubbleSort {

    public static int[] bubbleSort(int[] arr) {

        int temp;
        int index;
        for (int i = arr.length; i >= 0; i--) {
            for (int j = 0; j < arr.length - 1; j++) {
                index = j + 1;
                if (arr[j] > arr[index]) {
                    temp = arr[j];
                    arr[j] = arr[index];
                    arr[index] = temp;
                }

            }

        }
        return arr;
    }


    public static void main(String[] args) {


        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] arr2 = bubbleSort(arr1);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");

        }
    }

