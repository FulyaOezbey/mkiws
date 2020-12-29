package info.vs_verleihservice;

import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
@AllArgsConstructor
@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class PostgresqlUserService implements UserService {

    private final UserRepository repository;

    public User createUser(User newUser){
        newUser.setCreated(LocalDateTime.now());
        repository.save(newUser);
        return newUser;
    }

    public User findUser(int id){
        var user=repository.findById(id);
        if(user.isPresent()){
            var accessedUser= user.get();
            accessedUser.setLastAccessed(LocalDateTime.now());
            repository.save(accessedUser);
            return accessedUser;
        }
        return null;
    }
}
