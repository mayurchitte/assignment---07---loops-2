import java.util.Scanner;

public class Cos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x;
        int n;
        System.out.println(" value of x :");
        x = sc.nextDouble();
        System.out.println(" value of n :");
        n = sc.nextInt();

        double sum = 1.0;
        long f = 1;
        int s = -1;

        for (int i =1;i<=n;i++){
            f = f*i;
            if(i%2==0){
            sum = sum+s*(Math.pow(x,i))/f;
            s = s *-1; 
            }
        }
        System.out.printf("%.2f",sum);
    }
}

    

    
