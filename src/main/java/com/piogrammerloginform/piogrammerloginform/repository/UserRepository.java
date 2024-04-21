package com.piogrammerloginform.piogrammerloginform.repository;

import com.piogrammerloginform.piogrammerloginform.model.UserModel;
//import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

    Optional<UserModel> findByLoginAndPassword(String login, String password);
}
