package hrms.demo.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hrms.demo.entities.concretes.Candidate;

@Repository
public interface CandidateDao extends UserDao{
	Optional<Candidate> findByNationalIdentity(String nationalIdentity);

}
