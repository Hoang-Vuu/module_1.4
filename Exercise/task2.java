import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = reader.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the integer into the array:");

        int i;
        for (i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = reader.nextInt();
        }

        int maxSum = 0;
        int start = 0;
        int end = 0;

        for (int a = 0; a < n; a++) {
            int sum = 0;
            for (int c = a; c < n; c++) {
                sum += numbers[c];
                if (sum > maxSum){
                    maxSum = sum;
                    start = a;
                    end = c;
                }
            }
        }
        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + (start + 1) +" - " + (end + 1));
    }
}
