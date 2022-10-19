import java.util.*;

public class ProdList {
    private Product product;
    private List<Product> productList=new ArrayList<>();




    public void addProductList(Product product) {
        if (productList.contains(product)) {
            throw new NullPointerException("Продукт "+product.getName()+" уже есть в списке");

        } else{ productList.add(product);}


    }
    public void removeProductList(Product product) {

        productList.remove(product);
    }

    public List<Product> getProductList() {

        return productList;
    }

    @Override
    public String toString() {
        return "ProdList{" +
                "productList=" + productList +
                '}';
    }
}




