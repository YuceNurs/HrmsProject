package hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hrms.demo.entities.abstracts.User;

@Repository
public interface UserDao<T extends User> extends JpaRepository<T, Integer> {

	@Query("SELECT COUNT(u.id) FROM User u WHERE u.email=:email") int
    countUsersWithEmail(String email);

}
