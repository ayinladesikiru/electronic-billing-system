package EBillingSystem.data.repositories;

import EBillingSystem.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepositories extends MongoRepository<User, String> {

    boolean existsByEmail(String email);

}
