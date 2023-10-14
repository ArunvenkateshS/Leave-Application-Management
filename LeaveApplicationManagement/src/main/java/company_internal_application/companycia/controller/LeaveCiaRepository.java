package company_internal_application.companycia.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import company_internal_application.companycia.model.Leave;
import java.util.List;




@Repository
public interface LeaveCiaRepository extends JpaRepository<Leave, String>{

	List<Leave> findByEid(long eid);
	
}
