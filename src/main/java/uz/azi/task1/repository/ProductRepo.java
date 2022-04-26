package uz.azi.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.azi.task1.entity.Product;

/**
 * @Author Aziza Tojiboyeva
 */
@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepo extends JpaRepository<Product, Long> {
}
