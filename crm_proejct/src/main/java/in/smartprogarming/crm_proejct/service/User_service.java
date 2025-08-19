package in.smartprogarming.crm_proejct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.smartprogarming.crm_proejct.User.User;
import in.smartprogarming.crm_proejct.repository.User_Repository;

@Service
public class User_service {
    
    @Autowired
   private  User_Repository user_Repository;

    public  void   saveRegistrPage(User user)
    {
 
         user_Repository.save(user);

    
    }

    public  boolean  CheckLoginUser(String Email ,String Password){

        User user_obj=   user_Repository.findByEmail(Email);
        if(user_obj!=null){
            return   Password.equals(user_obj.getPassword());
        }
        return false;
    }
    
}
