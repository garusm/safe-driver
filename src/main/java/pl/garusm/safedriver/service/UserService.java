package pl.garusm.safedriver.service;

import pl.garusm.safedriver.model.User;

public interface UserService {
    User findByUserName(String name);

    void saveUser(User user);
}
