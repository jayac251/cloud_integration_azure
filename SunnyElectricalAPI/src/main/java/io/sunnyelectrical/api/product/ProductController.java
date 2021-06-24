/**
 * 
 */
package io.sunnyelectrical.api.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jayac
 *
 */
@RestController
public class ProductController {

	@Autowired
	private ProductService prodService;

	@GetMapping("/products")
	private List<Product> getAllProducts() {
		return prodService.getAllProducts();
	}

	// creating a get mapping that retrieves the detail of a specific product
	@GetMapping("/products/{productid}")
	private Product getProducts(@PathVariable("productid") Long productid) {
		return prodService.getProductsById(productid);
	}

	// creating a delete mapping that deletes a specified product
	@DeleteMapping("/products/{productid}")
	private void deleteProduct(@PathVariable("productid") Long productid) {
		prodService.delete(productid);
	}

	// creating post mapping that post the product detail in the database
	@PostMapping("/products")
	private Long saveProduct(@RequestBody Product product) {
		prodService.saveOrUpdate(product);
		return product.getProductId();
	}

	// creating put mapping that updates the product detail
	@PutMapping("/products")
	private Product update(@RequestBody Product product) {
		prodService.saveOrUpdate(product);
		return product;
	}

}
