package info.vs_verleihservice;

import info.vs_verleihservice.User;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@EntityScan
@ComponentScan
@Repository
public interface UserRepository extends CrudRepository<User, Integer>, JpaRepository<User, Integer> {
}
