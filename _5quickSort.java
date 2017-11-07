package Algorithms;

public class _5quickSort {

    private int array[];
    private int length;

    public static void main(String args[]) {

        int[] arr1 = {10, 5, 9, 2, 55, 4};

        _5quickSort quick = new _5quickSort();
        quick.sort(arr1);
        for (int i : arr1) {
            System.out.print(i);
            System.out.print(" ");
        }

    }

    public void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        this.array = arr;
        this.length = arr.length;
        quickSort(0, length - 1);


    }

    private void quickSort(int low, int high) {


        int i = low;
        int j = high;
        // calculate pivot number, I am taking pivot as middle index number
        // Get the pivot element from the middle of the list
        int pivot = array[low + (high - low) / 2];
        //divide into two arrays;
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        //call quickSort() method recursively;
        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
    }

    public void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
