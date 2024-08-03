/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author suriyaramamurthy
 */
public class Products {    
    
    private List<Product> products ;  
    
    public Products(){
        
        this.products = new ArrayList<Product>();
        initStoreItems();
        
        
    }    
       
    public List<Product> getProducts(){
        
        return products;
        
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    
    public void add(Product product){
        this.products.add(product);
    }   
    
    public void initStoreItems(){
        
        Product p1 = new Product(1, "rice", 450.5, 2);
        Product p2 = new Product(2, "maggie", 23.0, 3);
        Product p3 = new Product(3, "Biscut", 10.0, 7);
        Product p4 = new Product(4, "chocolate", 55.0, 3);
        Product p5 = new Product(5, "chocos", 350.2, 2);

        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
  
    }
  
}
