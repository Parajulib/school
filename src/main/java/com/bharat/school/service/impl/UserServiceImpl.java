package com.bharat.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bharat.school.dao.UserDao;
import com.bharat.school.domain.UserLogin;
import com.bharat.school.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	
	@Autowired
    UserDao userDao;
    
    @Override
    public void saveUser(UserLogin user) {
        userDao.saveUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public List<UserLogin> listAllUsers() {
        return userDao.listAllUsers();
    }

    @Override
    public UserLogin getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public UserLogin getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }

    @Override
    public UserLogin getUserByVerification(String code) {
        return userDao.getUserByVerification(code);
    }

    @Override
    public void changePassword(UserLogin user) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode(user.getPassword());
        user.setPassword(password);
        user.setVerification("");
        userDao.saveUser(user);
    }
}
