import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many random names the program should generate?");
        int n = Integer.parseInt(reader.nextLine());

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}