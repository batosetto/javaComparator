import java.util.Comparator;

public class Product implements Comparable<Product>{

    int productId;
    String productName;
    double productPrice;

    public Product(int productId, String productName, double productPrice){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public int compareTo(Product that) {
        if(this.productPrice > that.productPrice) {
            return 1; //it means that if the "this.product" is higher than the "that.product", the "this.product" must be settled in front of "that.product"
        }
        if(this.productPrice == that.productPrice) {
            return 0; // it means that both products "are the same" in this comparison
        }
        //when this.productPrice < that.productPrice
        return -1; // finally, if "this.product" is lower that "that.product", its place must be after "that.product"
    }




}
