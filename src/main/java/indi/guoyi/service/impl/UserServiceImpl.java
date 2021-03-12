package indi.guoyi.service.impl;

import indi.guoyi.dao.UserDao;
import indi.guoyi.domain.User;
import indi.guoyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao ud;

    @Override
    public void insert(User user) {
        ud.insert(user);
    }

    @Override
    public void delete(Integer id) {
        ud.delete(id);
    }

    @Override
    public List<User> findAll() {
        return ud.findAll();
    }

    @Override
    public void update(User user) {
        ud.update(user);
    }
}
