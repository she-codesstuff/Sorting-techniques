package sorting_algorithms;


public class betterbubblesort {
    static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    //    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 3, 5};
//        int n = arr.length;
//        for (int j = 0; j <= n - 1; j++) {
//            boolean flag = true;
//            for (int i = 0; i < n - 1 - j; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    flag = false;
//                    break;
//                }
//
//            }
//            if(flag==true) break;
//            for (int i = 0; i < n - 1 - j; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    flag = true;
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//
//                }
//            }
//
//        }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5};
        int n = arr.length;
        for (int j = 0; j <= n - 1; j++) {
            int flag = 0;
            for (int i = 0; i < n - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag++;
                }
            }
            if(flag==0)  break;
        }
        print(arr);
    }
}
/* before each pass we can actually check
 if array is sorted or not*/

/* tc of best case = O(n);
tc of avg and worst case = o(n^2) */