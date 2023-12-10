
// Find the sum of the series 1 + 1/(2*2) + 1/(3*3) + 1/(4*4) + .....
// + 1/(n*n)


import java.util.Scanner;

public class SumSj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

       
        double sum = 0.0;
        double  i;

        for ( i = 1; i <= n; i++) {
            
            sum =sum +1 / (i*i) ;
        }

       System.out.println("Sum of the series: " + sum);
    }
}


