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


    public static class selectionSort {

        public static void main(String[] args) {

            int[] arr1 = {99, 88, 55, 66, 44, 22, 11, 33, 1};
            int[] arr2 = selectionS(arr1);
            for (int i : arr2) {
                System.out.print(i);
                System.out.print(", ");

            }

            System.out.println("\ninsertion");
            int[] arr3 = selectionS(arr1);
            for (int i : arr3) {
                System.out.print(i);
                System.out.print(", ");

            }
            System.out.println("\nBubble");
            int[] arr4 = bubbleSort(arr1);
            for (int i : arr3) {
                System.out.print(i);
                System.out.print(", ");

            }
        }

        public static int[] selectionS(int[] arr) {

            for (int i = 0; i < arr.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[index]) {
                        index = j;
                    }
                }
                //swap
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
            return arr;
        }

        public static int[] insertionS(int[] arr) {

            for (int i = 1; i < arr.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    }
                }
            }
            return arr;
        }

        public static int[] bubbleSort(int[] arr) {
            for (int i = arr.length; i >= 0; i--) {
                for (int j = 0; j < arr.length - 1; j++) {
                    int index = j + 1;
                    if (arr[j] > arr[index]) {
                        int temp = arr[j];
                        arr[j] = arr[index];
                        arr[index] = temp;
                    }
                }

            }
            return arr;
        }


    }
}
