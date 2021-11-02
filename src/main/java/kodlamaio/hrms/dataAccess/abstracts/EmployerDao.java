package hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hrms.demo.entities.concretes.Employer;

@Repository
public interface EmployerDao extends UserDao{
	
	
}
