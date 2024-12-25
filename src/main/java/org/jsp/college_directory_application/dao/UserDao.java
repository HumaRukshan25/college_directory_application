package org.jsp.college_directory_application.dao;

import org.jsp.college_directory_application.entity.User;
import org.jsp.college_directory_application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository
//public class UserDao {
//
//    @Autowired
//    private UserRepository repository;
//
//    public Optional<User> login(String username, String password) {
//        return repository.login(username, password);
//    }
//
//    public User saveUser(User user) {
//        return repository.save(user);
//    }
//
//    public Optional<User> getUserById(int id) {
//        return repository.findById(id);
//    }
//
//    public List<User> findAllUsers() {
//        return repository.findAll();
//    }
//}

@Repository
public class UserDao {

    @Autowired
    private UserRepository repository;

    public Optional<User> login(String username, String password) {
        return repository.login(username, password);
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public Optional<User> getUserById(int id) {
        return repository.findById(id);
    }

    public List<User> findAllUsers() {
        return repository.findAll();
    }
    
    public Optional<User> getUserByEmail(String email) {
        return repository.findByEmail(email);
    }
    
}
