package info.vs_verleihservice;

import info.vs_verleihservice.User;

public interface UserService {
    User createUser(User newUser);
    User findUser(int id);
}
