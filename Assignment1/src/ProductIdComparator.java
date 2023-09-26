import java.util.Comparator;

public class ProductIdComparator implements Comparator<Product> {
    public int compare(Product product1, Product product2) {
        if(product1.getProductId() > product2.getProductId()){
            return -1;
        }
        if(product1.getProductId() == product2.getProductId()){
            return 0;
        }
        //when: product1.getProductID() < product2.getProductID()
        return 1;
    }
}
