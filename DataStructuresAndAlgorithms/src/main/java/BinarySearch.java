public class BinarySearch {

    public int binarySearch(int[] arr, int left, int right, int num) {

        if (left > right) {
            return -1;
        }
        int mid = left + (right-left)/2;
        System.out.println ("Left = " + left + " Right = " + right + " Mid = " + mid);
        //System.out.println (mid);
        if(num == arr[mid]) {
            return mid;
        } else if (num < arr[mid]){
            return binarySearch (arr, left, mid-1, num);
        } else {
            return binarySearch (arr, mid+1, right, num);
        }
    }

    public static void main(String[] args) {
        //int arr[] = { 1, 4, 5, 6, 7, 8, 9, 10};
        int arr[] = { 5, 6, 8, 10, 15, 18, 21, 25};

        BinarySearch bs = new BinarySearch ();
        int ret = bs.binarySearch (arr, 0, arr.length-1, 8) ;
        if (ret == -1) {
            System.out.println ("Element not found");
        } else {
            System.out.println ("Element found at index " + ret);
        }


    }
}
