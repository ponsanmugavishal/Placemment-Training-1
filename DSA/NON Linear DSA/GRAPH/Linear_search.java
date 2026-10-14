

class search{
    public static int  LS(int[]arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 4;
        int result = search.LS(arr, target);
        System.out.println("Target found at index: " + result);
    } 
    
}
