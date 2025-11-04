package com.tnsif.spring_di_autowiring;

import java.util.ArrayList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
      
    	Cart cartByType = ac.getBean("cartByType", Cart.class);
    	System.out.println("Total price using autowire byType: " + calculateTotal(cartByType));
        Cart cartByName = ac.getBean("cartByName", Cart.class);
        System.out.println("Total price using autowire byName: " + calculateTotal(cartByName));

        Cart cartWithRef = ac.getBean("cart", Cart.class);
        System.out.println("Total price using explicit reference: " + calculateTotal(cartWithRef));		 
    }

    private static double calculateTotal(Cart cart) 
    {
    	// Retrieving the list of products from the cart
    	ArrayList<Product> list = cart.getProductList();
        double total = 0;
        // Calculating the total price of all products
        for (Product prod : list) {
            total += prod.getPrice();
        }
        return total;
    }
}