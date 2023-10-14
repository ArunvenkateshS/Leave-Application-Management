package company_internal_application.companycia.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import company_internal_application.companycia.model.Credentials;

@Repository
public interface CredentialCiaRepository extends JpaRepository<Credentials, Long>{

	List<Credentials> findByEid(long eid);
	List<Credentials> findByPassword(String password);
}
