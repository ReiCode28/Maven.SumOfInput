import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a number:");
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int userInput = in.nextInt();

        for (int i = 0; i <= userInput; i++)
        {
            sum += i;
        }
        System.out.println(sum);

    }

//    int sumOfNumbers(int n) {
//
//        return n + n;
//    }
//
//    // for Extra Credit
//    int gaussianSumOfNumbers(int n) {
//        return 0;
//    }
//
//    // for Extra extra credit - compare the methods and show which one is faster

}
