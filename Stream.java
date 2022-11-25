package test;

import java.util.*;
import java.util.stream.*;


public class Stream {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP Laptop", 25000));
        productList.add(new Product(2, "Dell Laptop", 30000));
        productList.add(new Product(3, "Lenevo Laptop", 27000));
        productList.add(new Product(4, "Sony Laptop", 28000));
        productList.add(new Product(5, "Apple Laptop", 90000));
        ///////////////////////////Get Price List//////////////
        System.out.println("This is Price List:");
        List<Long> priceList = productList.stream()
                .map(p -> p.price) ///Fetch Data
                .collect(Collectors.toList()); // Collect to a List
        System.out.println(priceList);
        //////////////////////////Get price over 65000 ////////////////////
        System.out.println("This is price over 65000:");
        productList.stream()
                .filter(p -> p.price > 65000) //Filter price
                .map(pm -> pm.price)  //fetch price
                .forEach(System.out::println);
        //////////////////////////Get product name, its price is 28000 ////////////////////
        System.out.println("Product name, its price is over 28000");
        productList.stream().filter(p -> p.price == 28000)
                .forEach(p -> System.out.println(p.name));
        //////////////////////////Get total price with reduce ////////////////////
        System.out.println("Total Price with reduce is:");
        long totalPrice = productList.stream().map(p -> p.price)
                .reduce(0L, (sum, price) -> sum + price);
        System.out.println(totalPrice);
        //////////////////////////Get total price with Collections ////////////////////
        System.out.println("Total Price with Collections is:");
        long totalPrice1 = productList.stream()
                .collect(Collectors.summingLong(p -> p.price));
        System.out.println(totalPrice1);
        //////////////////////////Get total price with Stream.sum ////////////////////
        System.out.println("Total Price with Stream.sum is:");
        long totalPrice2 = productList.stream().mapToLong(p -> p.price).sum();
        System.out.println(totalPrice2);
        //////////////////////////Get max price ////////////////////
        System.out.println("The max price is:");
        Product productA = productList.stream()
                .max((pr1, pr2) -> pr1.price > pr2.price ? 1 : -1).get();
        System.out.println(productA.price);
        //////////////////////////Get min price ////////////////////
        System.out.println("The min price is:");
        Product productB = productList.stream()
                .min((pr1, pr2) -> pr1.price > pr2.price ? 1 : -1).get();
        System.out.println(productB.price);
        //////////////////////////Get count price lower than 30000 ////////////////////
        System.out.println("This is count price lower than 30000:");
        long count = productList.stream()
                .filter(p -> p.price < 30000) //Filter price
                .count();
        System.out.println(count);
        //////////////////////////Convert List into Set ////////////////////
        System.out.println("Convert List into Set:");
        Set<Long> priceSet = productList.stream()
                .map(pp -> pp.price)
                .collect(Collectors.toSet());
        System.out.println(priceSet);
        //////////////////////////Convert List into Map<productId,productName> ////////////////////
        System.out.println("Convert List into Map<productId,productName>:");
        Map<Integer,String> productMap = productList.stream()
                .collect(Collectors.toMap(p->p.id,p->p.name));
        System.out.println(productMap);
    }
}
