package com.bharat.school.service;

import java.util.List;

import com.bharat.school.domain.UserLogin;

public interface UserService {

	public void saveUser(UserLogin user);
    public void deleteUser(int id);
    public List<UserLogin> listAllUsers();
    public UserLogin getUserById(int id);
    public UserLogin getUserByUsername(String username);
    public UserLogin getUserByVerification(String code);
    public void changePassword(UserLogin user);
    
}
