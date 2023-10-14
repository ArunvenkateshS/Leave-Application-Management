package company_internal_application.companycia.controller;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import company_internal_application.companycia.model.Employee;
import java.util.List;


@Repository
public interface EmployeeCiaRepository extends JpaRepository<Employee, Long>  {
	
	List<Employee> findByEid(long eid);

}
