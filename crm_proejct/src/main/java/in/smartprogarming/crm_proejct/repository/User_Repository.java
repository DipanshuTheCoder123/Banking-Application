package in.smartprogarming.crm_proejct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.smartprogarming.crm_proejct.User.User;
import java.util.List;


public interface  User_Repository extends  JpaRepository<User, Long> {
    
    User findByEmail(String email);
}
