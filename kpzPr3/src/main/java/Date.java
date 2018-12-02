public class Date {
    private int day;
    private int month;
    private int year;

    Date()
    {
        this.day =1;
        this.month = 1;
        this.year = 0;
    }

    Date(int day, int month, int year) throws DateException
    {
        if(day<1||day>31||month<1||month>12||year<0)
        {
            throw new DateException();
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setDay(int day) throws DateException{
        if(day<1 || day>31)
        {
            throw new DateException();
        }
        this.day = day;
    }
    public void setMonth(int month) throws DateException
    {
        if(month<1 || month>12)
        {
            throw new DateException();
        }
        this.month = month;
    }
    public void setYear(int year) throws DateException
    {
        if(year<0)
        {
            throw new DateException();
        }
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
}
