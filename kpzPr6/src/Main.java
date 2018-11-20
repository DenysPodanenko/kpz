import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String ... args) throws IOException {
        System.out.println("Podanenko Denys");

        Scanner in = new Scanner(System.in);

        String filePath = in.nextLine();
        in.close();

        List<String> inputText = textIO.getTextFromFile(filePath);

        List<String> outputText = new ArrayList<String>();
        for(String s : inputText)
        {
            String[] splited = s.split("\\s+");
            if(splited[1].toCharArray()[0] != 'K' && splited[1].toCharArray()[0] != 'C')
            {
                outputText.add(s);
            }
        }

        textIO.writeTextToFile("B.txt", outputText);

        //System.out.println(outputText);
    }
}
