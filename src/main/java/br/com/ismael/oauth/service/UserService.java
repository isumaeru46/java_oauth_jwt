package br.com.ismael.oauth.service;

import java.util.List;

import br.com.ismael.oauth.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    User findOne(long id);
    void delete(long id);
}
