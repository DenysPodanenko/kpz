import java.util.Scanner;

public class Main {
    public static void main(String ... args)
    {
        System.out.println("Podanenko Denys");

        Scanner in = new Scanner(System.in);

        Book[] books = new Book[10];

        for(int i=0;i<2;i++)
        {
            Book book = new Book();
            book.setId(Integer.parseInt(in.nextLine()));
            book.setAuthor(in.nextLine());
            book.setPublishingHouse(in.nextLine());
            int day = Integer.parseInt(in.nextLine());
            int month = Integer.parseInt(in.nextLine());
            int year = Integer.parseInt(in.nextLine());
            book.setPublishingYear(new Date(day,month,year));
            book.setPageCount(Integer.parseInt(in.nextLine()));
            book.setCost(Float.parseFloat(in.nextLine()));
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
            if(books[i].getPublishingYear().compare(books[i].getPublishingYear(), new Date(1,1,2000)) == 1)
            {
                System.out.println(books[i].toString());
            }
        }
    }
}

class Book
{
    Book()
    {
        this.id = 0;
        this.name = "";
        this.author = "";
        this.publishingHouse = "";
        this.publishingYear = new Date();
        this.pageCount = 0;
        this.cost = 0;
    }

    Book(int id, String name, String author, String publishingHouse, Date publishingYear, int pageCount, float cost)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.pageCount = pageCount;
        this.cost = cost;
    }
//seters
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setPublishingHouse(String publishingHouse)
    {
        this.publishingHouse = publishingHouse;
    }
    public void setPublishingYear(Date publishingYear)
    {
        this.publishingYear = publishingYear;
    }
    public void setPageCount(int pageCount)
    {
        this.pageCount = pageCount;
    }
    public void setCost(float cost)
    {
        this.cost = cost;
    }
    //getters
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public String getPublishingHouse()
    {
        return this.publishingHouse;
    }
    public Date getPublishingYear()
    {
        return this.publishingYear;
    }
    public int getPageCount()
    {
        return this.pageCount;
    }
    public float getCost()
    {
        return this.cost;
    }

    public String toString()
    {
        String output = "";
        output+=this.id; output+=' ';
        output+=this.author; output+=' ';
        output+=this.publishingHouse; output+=' ';
        output+=this.publishingYear.toString(); output+=' ';
        output+=this.pageCount; output+=' ';
        output+=this.cost;
        return output;
    }
    //fields
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private Date publishingYear;
    private int pageCount;
    private float cost;
}

class Date
{
    Date()
    {
        this.day =0;
        this.month = 0;
        this.year = 0;
    }

    Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setDay(int day)
    {
        this.day = day;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public int getDay()
    {
        return this.day;
    }
    public int getMonth()
    {
        return this.month;
    }
    public int getYear()
    {
        return this.year;
    }

    public String toString()
    {
        String output = "";
        output+=this.day; output+=".";
        output+=this.month; output+=".";
        output+=this.year;
        return output;
    }

    // 0 = equals, 1 = Date1>Date2, 2= Date1<Date2
    public int compare(Date date1, Date date2)
    {
        if(date1.year>date2.year)
        {
            return 1;
        }
        else if(date1.year<date2.year)
        {
            return 2;
        }
        else if (date1.month>date2.month)
        {
            return 1;
        }
        else if(date1.month<date2.month)
        {
            return 2;
        }
        else if(date1.day>date2.day)
        {
            return 1;
        }
        else if(date1.day<date2.day)
        {
            return 2;
        }

        return 0;
    }
    private int day;
    private int month;
    private int year;
}