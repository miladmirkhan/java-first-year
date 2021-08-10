//write a complite java program to find and display the sumatin of all posative odd numbers from 1 to 12
import java.util.Scanner;

public class oddNumbersum {
    public static void main(String args[]) {
        int N, i, sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        N = in.nextInt();

        for(i = 0; i <= N; i++){
            if((i%2) == 1){
                sum += i;
//sum=sum+i;
            }
        }

        System.out.print("Sum of all odd numbers between 0 to "
            + N + " = " + sum);
    }
}