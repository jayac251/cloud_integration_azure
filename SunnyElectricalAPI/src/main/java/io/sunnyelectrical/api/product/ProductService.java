package io.sunnyelectrical.api.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductRepository ProductsRepository;

	// getting all Product record by using the method findaAll() of CrudRepository
	public List<Product> getAllProducts() {
		List<Product> Product = new ArrayList<Product>();
		ProductsRepository.findAll().forEach(Products1 -> Product.add(Products1));
		return Product;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public Product getProductsById(Long id) {
		return ProductsRepository.findById(id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Product Product) {
		ProductsRepository.save(Product);
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(Long id) {
		ProductsRepository.deleteById(id);
	}

	// updating a record
	public void update(Product Product, int productId) {
		ProductsRepository.save(Product);
	}
}
