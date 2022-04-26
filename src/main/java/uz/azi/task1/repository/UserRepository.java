package uz.azi.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.azi.task1.entity.User;

/**
 * @Author Aziza Tojiboyeva
 */
@RepositoryRestResource(collectionResourceRel = "users",path = "users")
public interface UserRepository extends JpaRepository<User, Long> {
}
