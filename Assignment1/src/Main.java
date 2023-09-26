import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.String;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Wine - Vovray Sec Domaine Huet", 25.68));
        products.add(new Product(2, "Oil - Truffle, Black", 23.98));
        products.add(new Product(3, "Nori Sea Weed", 21.75));
        products.add(new Product(4, "Tomatos", 30.53));
        products.add(new Product(5, "Truffle Cups - White Paper",13.87 ));
        products.add(new Product(6, "Jam - Blackberry, 20 ML Jar", 45.51));
        products.add(new Product(7, "Pickles - Gherkins", 22.99));
        products.add(new Product(8, "Truffle Shells - Semi - Sweet", 43.99));
        products.add(new Product(9, "Appetizer - Seafood Assortment", 34.90));
        products.add(new Product(10,"Bread - Flat Bread", 13.72));


        Collections.sort(products);
        System.out.println("");
        System.out.println(format("%40s","Ascending Price Sorting"));
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(format("%-10s %30s %30s", "ProductID", "ProductName", "Price"));
        System.out.println("-------------------------------------------------------------------------");
        printProductDetails(products);

        Collections.sort(products, new ProductIdComparator());
        System.out.println("");
        System.out.println(format("%40s","Descending ID Sorting"));
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(format("%-10s %30s %30s", "ProductID", "ProductName", "Price"));
        System.out.println("--------------------------------------------------------------------------");
        printProductDetails(products);
    }

    private static void printProductDetails(List<Product> products){
        for (Product each : products){
            System.out.print(format("%-10s",each.getProductId()));
            System.out.print(format("%-30s", each.getProductName()) );
            System.out.println(format("%30s",each.getProductPrice()));
        }
    }

}