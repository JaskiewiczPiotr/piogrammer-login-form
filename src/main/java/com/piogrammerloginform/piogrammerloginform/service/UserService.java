package com.piogrammerloginform.piogrammerloginform.service;


import com.piogrammerloginform.piogrammerloginform.model.UserModel;
import com.piogrammerloginform.piogrammerloginform.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserModel registerUser(String login, String password, String email) {
        if (login == null || password == null) {
            return null;
        } else {
            UserModel userModel = new UserModel();
            userModel.setLogin(login);
            userModel.setPassword(password);
            userModel.setEmail(email);
            userRepository.save(userModel);
            return userRepository.save(userModel);
        }
    }

    public UserModel authenticate(String login, String password){
        return (UserModel) userRepository.findByLoginAndPassword(login, password).orElse(null);
    }
}
