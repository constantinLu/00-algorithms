package Algorithms;

public class _4mergeSort {

    private int[] array;
    private int[] tempArray;
    private int length;



    //sorting function (merge);
    public void sort(int[] arr) {
        this.array = arr;
        this.length = arr.length;
        this.tempArray = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // sort the right side of the array;
            doMergeSort(low, middle);
            // sort the right side of the array;
            doMergeSort(middle + 1, high);
            // combine them both
            mergeParts(low, middle, high);
        }
    }

    private void mergeParts(int low, int middle, int high) {

        // copy both parts into the helper array (copyArray);
        for (int i = low; i <= high; i++) {
            tempArray[i] = array[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }

        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
        // Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.
    }
    
        public static void main(String[] args) {
        System.out.println("--------MergeSort-----------");
        int[] arr = {4, 3, 2, 1, 0};
        _4mergeSort mms = new _4mergeSort();
        mms.sort(arr);
        for (int i : arr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }


}
