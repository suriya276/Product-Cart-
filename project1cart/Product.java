/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package project1cart;

import java.util.Objects;

/**
 *
 * @author suriyaramamurthy
 */ 
public class Product {

     
    /**
     * @param args the command line arguments
     */
  
// variables     
    private Integer pid;
    private String name;
    private Double price;
    private Integer stock;
    
//    methods 
    
    public Product(){
    }
    
    public Product(Integer pid,String name,Double price,Integer stock){
        
        this.pid =pid;
        this.name=name;
        this.price = price;
        this.stock=stock;
        
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
//    Overriding hashCode to reduce the null and duplicates and trace of the objects.
    @Override
    public int hashCode(){
        
        return Objects.hash(pid,name,price,stock);
    }
    
    @Override
    public String toString(){
        
        return " [product_id : "+ pid +", "+" name : "+ name + ", "+" price : "+ price +", "+" stock : "+stock + "]";
        
    }
    
    @Override
    public boolean equals(Object comparingObject){
        
        if(this == comparingObject) return true;
        
        if(comparingObject==null || getClass()!=comparingObject.getClass()) return false;
        
        Product product = (Product) comparingObject ;
        
        
        return Objects.equals(this.pid,product.pid)&& Objects.equals(this.name, product.name)&&
                Objects.equals(this.price, product.price)&& Objects.equals(this.stock, product.stock);
        
        
        
        
    }
 
    
}
