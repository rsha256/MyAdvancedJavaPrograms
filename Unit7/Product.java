package Unit7;/*
 * Created by rahul on 7/24/2017.
 */
import java.io.Serializable;

public class Product implements Serializable
{
    private int productNumber;
    private String productName;
    private int quantity;
    private double cost;

    public Product( int productNumber, String productName, int quantity, double cost )
    {
        this.productNumber = productNumber;
        this.productName = productName;
        this.quantity = quantity;
        this.cost = cost;
    }

    public int getProductNumber()
    {
        return productNumber;
    }

    public String getProductName()
    {
        return productName;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }
}
