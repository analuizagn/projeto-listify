package projeto.listify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.listify.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}