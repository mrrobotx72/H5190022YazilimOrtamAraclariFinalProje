package tr.edu.medipol.yazilimortamaraclari.MehmetFinal;

import java.util.*;

public final class ProductStore {

    private static final List<Product> PRODUCTS = new ArrayList<>(); 
    static {
        PRODUCTS.add( new Product("Playstation"  ,"5") );
        PRODUCTS.add( new Product("Xbox"      ,"4") );
        PRODUCTS.add( new Product("Nintendo"  ,"3") );
        PRODUCTS.add( new Product("Atarik" ,"2") );
    }
    
    private ProductStore() {
        
    }
    
    public static List<Product> getProduct() {
        return PRODUCTS;
    }
    
    public static List<Product> addProduct(Product product) {
        PRODUCTS.add(product);
        return PRODUCTS;
    }
    
    public static List<Product> removeProduct(String no){
        for(Product o : PRODUCTS) {
            if( o.getNo().equals(no) ) {
                PRODUCTS.remove(o);
            }
        }
        
        return PRODUCTS;
    }
    
}
