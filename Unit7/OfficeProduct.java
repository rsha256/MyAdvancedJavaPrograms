package Unit7;/*
 * Created by rahul on 7/24/2017.
 */

import java.io.Serializable;

public class OfficeProduct implements Serializable
{
    private int productCode;
    private String productDescription;
    private double productPrice;

    public OfficeProduct( int cd, String dsc, double pr )
    {
        productCode = cd;
        productDescription = dsc;
        productPrice = pr;
    }

    public int getProductCode()
    {
        return productCode;
    }

    public String getProductDescription()
    {
        return productDescription;
    }

    public double getProductPrice()
    {
        return productPrice;
    }
}