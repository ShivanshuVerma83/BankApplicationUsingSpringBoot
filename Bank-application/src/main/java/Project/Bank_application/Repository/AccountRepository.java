package Project.Bank_application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import Project.Bank_application.Entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}


