public class Book {
    //fields
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private Date publishingYear;
    private int pageCount;
    private float cost;


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

    Book(int id, String name, String author, String publishingHouse, Date publishingYear, int pageCount, float cost) throws UnsignedException
    {
        if(id< 0 || pageCount<0||cost<0)
        {
            throw new UnsignedException();
        }
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.pageCount = pageCount;
        this.cost = cost;
    }
    //seters
    public void setId(int id) throws UnsignedException
    {
        if(id < 0)
        {
            throw new UnsignedException();
        }
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
    public void setPageCount(int pageCount) throws UnsignedException
    {
        if(pageCount < 0)
        {
            throw new UnsignedException();
        }
        this.pageCount = pageCount;
    }
    public void setCost(float cost) throws UnsignedException
    {
        if(cost < 0)
        {
            throw new UnsignedException();
        }
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
}
