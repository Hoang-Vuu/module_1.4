import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = reader.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the integers into the array:");
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = reader.nextInt();
        }

        int[] unique = new int[n];
        int count = 0;

        for (int a = 0; a < n; a++) {
            int duplicate = 0;
            for (int j = 0; j < count; j++) {
                if (numbers[a] == unique[j]) {
                    duplicate++;
                }
            }
            if (duplicate == 0) {
                unique[count] = numbers[a];
                count++;
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int b = 0; b < count; b++) {
            System.out.print(unique[b] + " ");
        }
        System.out.println();
    }
}
