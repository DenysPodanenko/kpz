import java.util.Scanner;

public class Iinter {
    static public String question()
    {
        System.out.println("do you want to retype?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equals("y")) {
            return "y";
        } else {
            return "n";
        }
    }
}
