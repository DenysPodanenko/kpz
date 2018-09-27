import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Denys Podanenko");
        byte[][] matrix = new byte [7][7];
        int a = -128;
        int b = 255;

        //int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        for (int i=0;i < matrix.length;i++){
            for (int j=0;j < matrix[i].length;j++){
                matrix[i][j]=(byte)(a + (int) (Math.random() * 255));
            }
        }
        byte min=matrix[0][0];
        int minX=0;
        int minY=0;
        for (int i=0;i < matrix.length;i++){
            for (int j=0;j < matrix[i].length;j++){
                if(matrix[i][j]<min)
                {
                    min = matrix[i][j];

                    minX = i;
                    minY = j;
                }
            }
        }
        System.out.println(min);

        for (int i=0;i < matrix.length;i++){
            for (int j=0;j < matrix[i].length;j++){
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y =in.nextInt();

        for(int i=0;i<matrix[minX].length;i++)
        {
            byte tmp = matrix[minX][i];
            matrix[minX][i] = matrix[x][i];
            matrix[x][i] = tmp;
        }
        for(int i=0;i<matrix.length;i++)
        {
            byte tmp = matrix[i][minY];
            matrix[i][minY] = matrix[i][y];
            matrix[i][y] = tmp;
        }

        for (int i=0;i < matrix.length;i++){
            for (int j=0;j < matrix[i].length;j++){
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
