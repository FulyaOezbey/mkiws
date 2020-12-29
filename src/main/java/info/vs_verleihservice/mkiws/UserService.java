package info.vs_verleihservice.mkiws;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
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
