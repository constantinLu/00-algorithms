package Algorithms;

public class _7BinarySearch {

    static int binarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Key 14's position: " + binarySearch(arr, 14));
        int[] arr1 = {6, 34, 78, 123, 432, 900};
        System.out.println("Key 432's position: " + binarySearch(arr1, 432));
    }

}
