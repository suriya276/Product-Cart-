# Product-Cart-

Product Cart Management System

Project Description

The Product Cart Management System is a console-based application developed using Java. It allows users to manage a cart of products with features to add, remove, and display products. This project showcases object-oriented programming concepts, including the use of interfaces, exception handling, and iterators.

Features

Add products to the cart
Remove products from the cart
Display all products in the cart
Handle exceptions for robust application performance
Installation Instructions

Ensure you have Java SE 11 or higher installed on your machine.
Download the provided .class files and place them in the same directory.
Usage

To run the application, follow these steps:

Open a terminal or command prompt.
Navigate to the directory containing the .class files.
Run the application using the following command:
sh
Copy code
java Driver
Class Descriptions

Driver.class
The Driver class serves as the entry point for the application. It initializes the application and provides the main menu for user interaction.

Product.class
The Product class represents a product with attributes such as ID, name, and price. It includes methods to get and set these attributes.

Products.class
The Products class is a collection of Product objects. It provides methods to add, remove, and display products in the cart.

Cart.class
The Cart class manages the user's cart. It uses an ArrayList to store products and provides methods to manipulate the cart's contents.

UI.class
The UI class handles user input and output, providing a console-based interface for the user to interact with the application.

Example Usage

After running the application, follow the prompts to add or remove products from the cart and display the current contents. Here is an example interaction:

plaintext
Copy code
Welcome to the Product Cart Management System!
1. Add Product
2. Remove Product
3. Display Products
4. Exit
Enter your choice: 1
Enter Product ID: 101
Enter Product Name: Example Product
Enter Product Price: 29.99
Product added successfully!
Contribution

If you would like to contribute to this project, feel free to fork the repository and submit a pull request.

License

This project is licensed under the MIT License - see the LICENSE file for details.

Contact

For any questions or feedback, please contact [Your Name] at [Your Email Address]
