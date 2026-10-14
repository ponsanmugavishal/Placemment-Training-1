import java.util.Scanner;

public class Not_Repeating_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] b = new int[n];
        int c = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                b[c] = arr[i];
                c++;
            }
        }

        for (int i = 0; i < c; i++) {
            System.out.print(b[i] + " ");
        }
        sc.close();
    }
}