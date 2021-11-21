
package Reto1.Ciclo4.Reto1.Ciclo4.Repository.crud;

import Reto1.Ciclo4.Reto1.Ciclo4.Model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    //Optional<User> findByName(String name);
    
}
