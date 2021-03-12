package indi.guoyi.service;

import indi.guoyi.domain.User;

import java.util.List;

public interface UserService {

    void insert(User user);

    void delete(Integer id);

    List<User> findAll();

    void update(User user);
}
