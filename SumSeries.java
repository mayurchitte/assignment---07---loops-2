//Find the sum of the series 1/1! + 2/2! + 3/3! + ... + n/n!

import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        double sum = calculateSeriesSum(n);

        System.out.println("Sum of the series: " + sum);
    }

    private static double calculateSeriesSum(int n) {
        double sum = 0;
        double factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += i / factorial;
        }

        return sum;
    }
}
