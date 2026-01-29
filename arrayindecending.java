package sorting_algorithms;

public class arrayindecending {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5};
        int n = arr.length;
        for (int j = n-1; j > 1 ; j++) {
            int flag = 0;
            for (int i = n - 1-j; i > 1; i++) {
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

    static void print(int []arr ) {
        for(int i = 0; i<arr.length;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
