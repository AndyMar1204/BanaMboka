package com.andy.banamboka.services;

import com.andy.banamboka.dao.UserDao;
import com.andy.banamboka.model.User;
import com.andy.banamboka.services.interfaces.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("userService")
@Transactional
public class UserService implements IUser {
    @Autowired
    UserDao userDao;
    @Override
    public User getById(long id) {
        return userDao.getById(id);
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User update(User user) {
        return userDao.save(user);
    }

    @Override
    public void deleteById(long id) {
        userDao.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }

    @Override
    public boolean checkExist(long id) {
        return userDao.existsById(id);
    }
}
