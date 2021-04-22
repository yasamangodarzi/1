package com.company;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Product {
    private String name;
    private String category;
    private float weight;
    private float price;
    private LocalDate manufacture = LocalDate.now();
    private LocalDate expiration = LocalDate.now();

    public Product(String name, String category, float weight, float price,LocalDate manufacture,LocalDate expiration) {
        this.name = name;
        this.category = category;
        this.weight = weight;
        this.price = price;
        this.manufacture=manufacture;
         setExpiration(expiration);
    }
    public LocalDate getManufacture() {
        return manufacture;
    }
    public void setExpiration(LocalDate expiration) {

        if (expiration.compareTo(getManufacture())>0 ) {
            // When Date expiration > manufacture
            this.expiration=expiration;
        }
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
//        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd-MM-uuuu");
//        String text = manufacture.format(formatters);
//        String text1 = expiration.format(formatters);
        return "\"Product\" :{" +"\n" +
                " \"NAME\": " +"\""+name+"\""+ ",\n" +
                " \"CATEGORY\": "+"\""+ category + "\""+",\n" +
                " \"WEIGHT\": " +"\""+ weight +"\""+ ",\n" +
                " \"PRICE\": "+"\""+ price +"\""+ ",\n" +
                " \"MANUFACTURE_DATE\": " +manufacture + ",\n" +
                " \"EXPIRATION_DATE\": " + expiration + ",\n" +
                '}';
    }
}
