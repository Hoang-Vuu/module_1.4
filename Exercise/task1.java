import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many random names the program should generate?");
        int n = Integer.parseInt(reader.nextLine());

        String[] lastname = {"A", "B", "C", "D", "E", "F" };
        String[] firstname = {"G", "H", "I", "K", "L", "M" };

        for (int i = 0; i < n; i++) {
            int luku = (int) (Math.random() * lastname.length);
            int luku2 = (int) (Math.random() * firstname.length);
            System.out.println(lastname[luku] + " " + firstname[luku2]);
        }
    }
}