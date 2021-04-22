package com.company;

import java.util.*;

public class Inventory {
   private HashMap<Product,Integer> inventory= new HashMap<>();
   private LinkedHashMap<Product,Integer> c= new LinkedHashMap<>();
   public void addProduct(Product product,int stock)
   {
       inventory.put(product,stock);
       c.put(product,stock);
   }
   public void removeProduct(Product product) {
       for (Iterator<Map.Entry<Product,Integer>> it = inventory.entrySet().iterator(); it.hasNext(); ) {
           Map.Entry<Product,Integer> entry = it.next();
           if (entry.getKey().equals(product)) {
               it.remove();
           }
       }

   }
    public void changeStock(Product product,boolean buy)
    {
        if (buy)
        {
            inventory.computeIfPresent(product, (key, val) -> val + 1);
           c.computeIfPresent(product, (key, val) -> val + 1);

        }else
        {
            inventory.computeIfPresent(product, (key, val) -> val - 1);
            c.computeIfPresent(product, (key, val) -> val - 1);
            if (inventory.get(product)==0)
            {
                inventory.remove(product);
                c.remove(product);
            }
        }
    }
 public void print()
 {
     if (inventory.isEmpty())
     {
         System.out.println("We are out of stock.");
     }else
     {
         int value=1;
         Set<Product> keys = c.keySet();
         for (Product key : keys) {
             System.out.println(value +")"+"{");
             System.out.println(key.toString());
             System.out.println("}"+"instock: " +c.get(key));
             value++;
         }
     }

 }

 public Product getProduct(String ind) {
     int index=Integer.valueOf(ind);
     Set<Product> keySet = c.keySet();
     Product[] keyArray = keySet.toArray(new Product[keySet.size()]);
     Product key = keyArray[index - 1];
     return key;
 }
    @Override
    public String toString() {
        return "Inventory{" +
                "inventory=" + inventory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Inventory)) return false;
        Inventory inventory1 = (Inventory) o;
        return Objects.equals(inventory, inventory1.inventory) && Objects.equals(c, inventory1.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inventory, c);
    }
}
