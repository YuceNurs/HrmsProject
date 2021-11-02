package hrms.demo.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.demo.entities.concretes.ActivationCode;

public interface ActivationCodeDao extends JpaRepository<ActivationCode, Integer> {

	//Optional<ActivationCode> findByUserUid(String uid);

}
