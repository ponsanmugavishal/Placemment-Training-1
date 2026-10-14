package DSA.SORTING;

public class Bubbel_sorting {
    public static void  main(String[] args) {
        int arr[] = {5,3,9,7,2,4,6,1,8};
        for (int j = 0;j < arr.length;j++) {
            for (int i = 0; i <arr.length - 1;i++) {
                if (arr[i] > arr[i+1]) {
                    int b = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = b;
                }
            }
        }
        for (int i = 0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}