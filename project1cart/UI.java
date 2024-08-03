/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1cart;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author suriyaramamurthy
 */
public class UI {
    
    private Products storeProducts;
    private Cart cart;
    private int ch;
    
    Scanner sc = new Scanner(System.in);
   
    UI(){
        
        this.cart= new Cart();
        this.storeProducts= new Products();
        this.cart=cart;
        this.ch=ch;
        
    }
    
    public void startScreen(){

        System.out.println("---- Welcome to the Store ----");
        menu();
       
    }
    
    public void storeProductMenu(){
       
        System.out.println("Product menu in store : ");
     
        displayStoreProducts();
        
        
    }
    
    public void menu(){
 
         while(true){
            
            System.out.println("Menu : ");
            System.out.println("press - 1 to Display Store Products");
            System.out.println("press - 2 to Add Product to Cart");
            System.out.println("press - 3 to Show Cart");
            System.out.println("press - 4 to Remove Product from Cart");
            System.out.println("press - 5 to Exit");
            System.out.print("Enter your choice: ");
            int choice = getUserInput();
            

  
            switch(choice){
                
                case 1 : {
                   storeProductMenu();
                    break;
                }
                case 2 : {
                    addProductToCart();
                    break;
                }
                case 3 :{
                    showCart();
                    break;
                }
                case 4 :{
                    removeProductFromCart();
                    break;
                }
                case 5:{
                    System.out.println(" Thank you .... Have a nice day ... ");
                    return;
                }
                default :{
                    System.out.println("Invalid Input .....Enter a Valid Input");
                }
            }
            
        }
    
    }

    public int getUserInput(){
        
        int choice = -1;
        boolean cond = false ;
        
        while(!cond){
        try{
        choice = sc.nextInt();
        cond = true;
    }catch(InputMismatchException e){
            System.out.println("Your input is not valid . please provide the numbers from 1 - 5 ");
           
            System.out.print("Enter the Valid Input ... ");
             sc.next();
    }
        }
        return choice;
    }
    
    public void displayStoreProducts(){
        
        System.out.println("Store Products : ");
        
        for(Product product : storeProducts.getProducts() ){
            
            System.out.println(product);
        }
        
    }
    
    public void addProductToCart(){
        
        displayStoreProducts();
        System.out.println("Enter the product ID to add to Cart : ");
        
        int productId = getUserInput();
        Product product = null;   
      
        for(Product p : storeProducts.getProducts()){
            if(p.getPid() == productId){
                product = p;
                break;
                
            }
        }
        if(product!=null){
            cart.addToCart(product);
            System.out.println("Product added to the Cart ...");
        }else{
            System.out.println("the product is not Found ... ");
        }
        
    }
    
    public void showCart(){
        
        cart.printCartItems();
        
    }
    
    public void removeProductFromCart(){
        
     System.out.println("Enter the product ID to remove from the Cart: ");
    int removalProductId = sc.nextInt();
    
    Product product = cart.getProductByProductID(removalProductId);
    
    if (product != null) {
        cart.removeProductByPID(removalProductId);
        System.out.println("Item removed ... ");
    } else {
        System.out.println("Product not found in the cart ... ");
    }
    }
   
}
