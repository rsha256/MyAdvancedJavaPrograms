package Unit8;

public class Customer
{
    private String name;
    private int serviceTime;

    public Customer( String name, int serviceTime )
    {
        this.name = name;
        this.serviceTime = serviceTime;
    }

    public String getName()
    {
        return name;
    }

    public int getTime()
    {
        return serviceTime;
    }
} 