import java.util.Scanner;

public class Main {
    public static void main(String ... args)
    {
        System.out.println("Podanenko Denys");

        Scanner in = new Scanner(System.in);

        Book[] books = new Book[10];

        int counter = 0;
        while(counter<2)
        {
            try
            {
                Book book = new Book();
                book.setId(Integer.parseInt(in.nextLine()));
                book.setAuthor(in.nextLine());
                book.setPublishingHouse(in.nextLine());
                int day = Integer.parseInt(in.nextLine());
                int month = Integer.parseInt(in.nextLine());
                int year = Integer.parseInt(in.nextLine());
                book.setPublishingYear(new Date(day, month, year));
                book.setPageCount(Integer.parseInt(in.nextLine()));
                book.setCost(Float.parseFloat(in.nextLine()));
                books[counter] = book;

                counter++;
            }
            catch (UnsignedException e)
            {
                System.out.println(e.getMessage());
            }
            catch (DateException e)
            {
                System.out.println(e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("do you want to retype?");
                Scanner sc = new Scanner(System.in);
                String answer = sc.nextLine();
                if (answer.equals("y")) {
                    continue;
                } else {
                    break;
                }
            }
        }

        /*books[0] = new Book(1,"book1","A","house1",new Date(10,10,2000),10,49.99f);
        books[1] = new Book(2,"book2","A","house1",new Date(1,5,3000),100,59.99f);
        books[2] = new Book(3,"book3","B","house1",new Date(2,11,200),1000,429.99f);
        books[3] = new Book(4,"book4","B","house2",new Date(3,12,20),80,45.99f);
        books[4] = new Book(5,"book5","C","house2",new Date(5,1,1000),880,41.99f);
        books[5] = new Book(6,"book6","D","house2",new Date(11,2,24000),880,19.99f);
        books[6] = new Book();
        books[7] = new Book();
        books[8] = new Book(7,"book7","E","house1",new Date(30,10,2500),108,11.99f);
        books[9] = new Book(8,"book8","F","house1",new Date(20,10,2900),1009,123.99f);*/

        //list of books of author
        for(int i=0;i<10;i++)
        {
            if(books[i].getAuthor() == "B")
            {
                System.out.println(books[i].toString());
            }
        }

        //list of books publishing by publishing house
        for(int i=0;i<10;i++)
        {
            if(books[i].getPublishingHouse() == "house2")
            {
                System.out.println(books[i].toString());
            }
        }

        //list of books publishing after some year
        for(int i=0;i<10;i++)
        {
            try {
                if (books[i].getPublishingYear().compare(books[i].getPublishingYear(), new Date(1, 1, 2000)) == 1) {
                    System.out.println(books[i].toString());
                }
            }
            catch (DateException e)
            {
                e.getMessage();
            }
        }
    }
}