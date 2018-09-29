import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String[] words = s.split("\\s");
        String answer = "";

        for (String str:words)
        {
            boolean isSubStrContChar = false;
            for(int i = 'a';i<='z';i++)
            {
                if(str.indexOf((char)i) != -1)
                {
                    isSubStrContChar = true;
                }
            }

            if(!isSubStrContChar && str.length() > answer.length())
            {
                answer = str;
            }
        }

        System.out.println(answer);
    }
}
