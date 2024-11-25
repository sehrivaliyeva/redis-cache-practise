package practise.rediscachepractise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practise.rediscachepractise.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
