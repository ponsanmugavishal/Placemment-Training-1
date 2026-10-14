import java.util.Scanner;

public class Numerical_to_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] ones = {
            "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };

        String[] teens = {
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        if (n == 0) {
            System.out.println("Zero");
        } 
        else {
            if (n >= 100) {
                System.out.print(ones[n / 100] + " Hundred ");
                n = n % 100;
            }

            if (n >= 10 && n <= 19) {
                System.out.print(teens[n - 10]);
            } 
            else {
                if (n >= 20) {
                    System.out.print(tens[n / 10] + " ");
                    n = n % 10;
                }

                if (n > 0) {
                    System.out.print(ones[n]);
                }
            }
        }

        sc.close();
    }
}