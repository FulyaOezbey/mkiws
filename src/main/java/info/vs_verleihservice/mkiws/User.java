package info.vs_verleihservice.mkiws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Table(name="user")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    private LocalDateTime created;

    private LocalDateTime lastAccessed;
}
