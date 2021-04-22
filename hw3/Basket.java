package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Basket {
    private ArrayList<Product> myBasket=new ArrayList<>();
    public void addProductBasket(Product product)
    {
        myBasket.add(product);
    }
    public void removeProductBasket(String ind)
    {
        int index=Integer.valueOf(ind);
        myBasket.remove(myBasket.get(index-1));
    }
    public void calculateProductPrice()
    {
        float price=0;
        for (Product pro:myBasket) {
             price+=pro.getPrice();
        }
        System.out.println(price);
    }
    public void print()
    {
        if (myBasket.isEmpty())
        {
            System.out.println("List is empty.");
        }else
        {
            System.out.println("Itemsincart:");
            int value=1;
            for (Product key : myBasket) {
                System.out.println(value +")"+"{");
                System.out.println(key.toString());
                value++;
            }
        }
    }
    public Product getProduct(String ind)
    {
        int index=Integer.valueOf(ind);
       return myBasket.get(index);
    }
    @Override
    public String toString() {
        return "Basket{" +
                "myBasket=" + myBasket +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Basket)) return false;
        Basket basket = (Basket) o;
        return myBasket.equals(basket.myBasket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myBasket);
    }
}
