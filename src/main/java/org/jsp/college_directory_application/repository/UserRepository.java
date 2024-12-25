package org.jsp.college_directory_application.repository;

import org.jsp.college_directory_application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Repository
//public interface UserRepository extends JpaRepository<User, Integer> {
//
//    @Query("SELECT u FROM User u WHERE u.username = :username AND u.password = :password")
//    Optional<User> login(String username, String password);
//}


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.username = :username AND u.password = :password")
    Optional<User> login(String username, String password);

   
    Optional<User> findByEmail(String email);


}