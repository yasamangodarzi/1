package com.company;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args)   {
        Inventory inventory=new Inventory();
        Basket basket=new Basket();
        Scanner sc = new Scanner(System.in);
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.now();
        Product  product1=new Product("Carrot","Vegetables",5,20,
                localDate1.parse("2020-03-15"), localDate2.parse("2021-03-15"));
        Product  product2=new Product("Apple","Fruits",10,50,
                 localDate1.parse("2020-04-01"),localDate2.parse("2020-08-01"));
        Product  product3=new Product("12xEggs","Egg",100,40,
                localDate1.parse("2020-01-01"),localDate2.parse("2020-06-01"));
        Product  product4=new Product("Oats","Grains",70,100,
                localDate1.parse("2020-06-01"),localDate2.parse("2021-01-01"));
        Product  product5=new Product("Salmon","Seafood",150,250,
                localDate1.parse("2020-01-01"),localDate2.parse("2020-02-01"));
        Product  product6=new Product("Stake","Meat",800,1000,
                localDate1.parse("2020-03-01"),localDate2.parse("2020-09-01"));
        Product  product7=new Product("Milk","Dairy",100,20,
                localDate1.parse("2020-01-10"),localDate2.parse("2020-01-25"));
        Product  product8=new Product("Cheese","Dairy",150,10,
                localDate1.parse("2020-02-01"),localDate2.parse("2020-03-15"));
        inventory.print();
        inventory.addProduct(product1,10);
        inventory.addProduct(product2,50);
        inventory.addProduct(product3,20);
        inventory.addProduct(product4,45);
        inventory.addProduct(product5,5);
        inventory.addProduct(product6,5);
        inventory.addProduct(product7,20);
        inventory.addProduct(product8,50);
         inventory.print();
        boolean work=true;
        while (work)
        {
            String command= sc.nextLine();
            if (command.equals("checkout"))
            {
                System.out.println("It was a pleasure doing business with you.");
                work=false;
            }
            if (command.startsWith("add"))
            {
                String intValue = command.replaceAll("[^0-9]", "");
                inventory.changeStock(inventory.getProduct(intValue),false);
                basket.addProductBasket(inventory.getProduct(intValue));
            }
            if (command.startsWith("remove"))
            {
                String intValue = command.replaceAll("[^0-9]", "");
                inventory.changeStock(basket.getProduct(intValue),true);
                basket.removeProductBasket(intValue);

            }
            if (command.startsWith("cart"))
            {
                basket.print();
            }
            if (command.startsWith("products"))
            {
                inventory.print();
            }

        }
    }
}
