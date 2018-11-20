import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class textIO {
    public static List<String> getTextFromFile(String filePath)
    {
        File file = new File(filePath);
        List<String> inputText = new ArrayList<String>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                inputText.add(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }

        return inputText;
    }

    public static void writeTextToFile(String fileName, List<String> outputText) throws FileNotFoundException{
        try (PrintStream out = new PrintStream(new FileOutputStream(fileName))) {
            out.print(outputText);
        }
    }
}
