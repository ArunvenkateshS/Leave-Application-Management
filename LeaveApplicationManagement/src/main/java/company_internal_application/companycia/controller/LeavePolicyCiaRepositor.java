package company_internal_application.companycia.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import company_internal_application.companycia.model.LeavePolicy;

@Repository
public interface LeavePolicyCiaRepositor extends JpaRepository<LeavePolicy, String> {

}
