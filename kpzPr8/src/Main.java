import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String ... args)
    {
        System.out.println("Podanenko Denys");

        CustomList<Integer> list = new CustomList<Integer>();

        for(int i=0;i<15;i++) {
            list.appendElem(1+(int)(Math.random() * 100));
            list.coutList();
        }
    }
}
