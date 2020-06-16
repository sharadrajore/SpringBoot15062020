package com.zensar.firstspringbootapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.firstspringbootapp.entity.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
	List<Product> products = new ArrayList<>();
	
	public ProductRepositoryImpl() {
		products.add(new Product(1001,"HDD",4500));
	}
	
	
	
	public List<Product> getAllProducts() {
		return products;
	}


	public Product getProduct(@PathVariable("productId")int productId) {
		for(Product product :products) {
			if(product.getProductId()==productId) {
				return product;
			}
		}
		return null;
	}


	public void insertProduct(@RequestBody Product product) {
		products.add(product);
	}

	
	public void deleteProduct(@PathVariable("productId") int productId) {
		
		for(int i=0;i<products.size();i++) {
			
			Product product=products.get(i);
			
			if(product.getProductId()==productId) {
				products.remove(product);
			}
			
		}
		
	}

	
	public void updateProduct(int productId, Product product) {
		System.out.println("public void updateProduct(int productId, Product product)");
	}

	

}
