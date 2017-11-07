public class _6LinearSearch {

    public static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 43, 5, 3, 2, 56, 6, 7, 2, 34, 54, 54, 23, 35};
        int skey = 23;
        System.out.println("Key " + skey + " found at index " + linearSearch(arr, 23));
    }

}
