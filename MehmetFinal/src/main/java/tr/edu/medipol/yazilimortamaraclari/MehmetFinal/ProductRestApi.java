package tr.edu.medipol.yazilimortamaraclari.MehmetFinal;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/product")
public class ProductRestApi {

    @GetMapping("/list")
    public List<Product> list(){
        return ProductStore.getProduct();
    }
    
    @PostMapping("/add")
    public Product add(@RequestBody Product product){
    	ProductStore.addProduct(product);
    	return product;
    }
    
    @PostMapping("/delete")
    public List<Product> remove(@RequestBody Product product){
        return ProductStore.removeProduct(product.getNo());
    }
    
}
