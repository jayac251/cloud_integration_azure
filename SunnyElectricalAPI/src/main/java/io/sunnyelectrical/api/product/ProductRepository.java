/**
 * 
 */
package io.sunnyelectrical.api.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jayac
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
