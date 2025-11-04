package com.tnsif.spring_di_autowiring;

import java.util.ArrayList;

	public class Cart {
		
		 private ArrayList<Product> productList;
		 
		 public ArrayList<Product> getProductList() {
		     return productList==null ? new ArrayList<>():productList;
		 }
		 
		 public void setProductList(ArrayList<Product> productList) {
		     this.productList = productList;
		 }

	}


