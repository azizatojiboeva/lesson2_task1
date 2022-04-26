package uz.azi.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.azi.task1.entity.Warehouse;

/**
 * @Author Aziza Tojiboyeva
 */
@RepositoryRestResource(collectionResourceRel = "warehouse", path = "warehouse")
public interface WareHouseRepo extends JpaRepository<Warehouse, Long> {
}
