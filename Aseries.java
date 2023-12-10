// Given two integers a and n. The task is to find the sum of the
// series 1/a + 2/a
// 2 + 3/a
// 3 + ... + n/a
// n
// .

        import java.util.Scanner;

        public class Aseries {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the value of a: ");
                int a = sc.nextInt();

                System.out.print("Enter the value of n: ");
                int n = sc.nextInt();

                double sum = 0;
                for (double i = 1; i <= n; i++) {
                    sum = sum  + (i/ Math.pow(a,i));
                    System.out.println(sum);       
                }

                System.out.println("Sum of the series: " + sum);

                
            }
        }
