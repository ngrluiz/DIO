package repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import DIO.Java_Spring_Data.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
