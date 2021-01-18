package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    void saveUser(User user);

    void editUser(User user);

    void deleteUser(int id);


}
