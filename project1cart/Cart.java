/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author suriyaramamurthy
 */
public class Cart {
    
    
    private List<Product> cart;
    
    public Cart(){
   this.cart = new ArrayList<>() ;
    }
    
    public void addProductToCartByPID(int PID){
          
        Product product = getProductByProductID(PID);
        
        if(product!=null){
            cart.add(product);
        }
        

    }
    
//    it will search the product PID in the cart if it found it returns 
    
    public Product getProductByProductID(int PID){
        
      for(Product product : cart ){
          if(product.getPid() == PID){
             return product;          
          }
      }
      
//     here Product is an object so i used null value .
      return null;
           
    }
    
//    Adding all the product to the Cart 
    
    public void addToCart(Product product){
        this.cart.add(product);
        
    }
    
//    if i wanna remove my produt first i need to check weather it is in the cart or not .
//    So we need to check it with getProductByProductID
    
    public void removeProductByPID(int PID){
        
        Product product = getProductByProductID(PID);
        
        if(product!=null){
            for( Iterator<Product> iterator = cart.iterator() ; iterator.hasNext() ; ){
                Product id = iterator.next();
                if(id.getPid() == PID){
                    iterator.remove();
                }
                  
            }
        } 
        
    }
    
//    Printing all the cart items 
    
    public void printCartItems(){
        
        for(Product product : cart){
//       
                System.out.println(product);
        }
    } 
}