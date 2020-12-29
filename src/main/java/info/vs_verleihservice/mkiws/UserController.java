package info.vs_verleihservice.mkiws;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService service;

    @PutMapping()
    public ResponseEntity<User> addNewUser(@RequestBody User newUser){
        service.createUser(newUser);
        return ResponseEntity.ok(newUser);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable("id") int id){
        return ResponseEntity.ok(service.findUser(id));
    }

}
