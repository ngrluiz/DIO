package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import DIO.model.User; // Fixed import: use the correct package for User

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
