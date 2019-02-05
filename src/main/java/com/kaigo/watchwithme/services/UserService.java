package com.kaigo.watchwithme.services;

import com.kaigo.watchwithme.domain.Room;
import com.kaigo.watchwithme.domain.User;
import com.kaigo.watchwithme.repository.RoomRepository;
import com.kaigo.watchwithme.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveOrUpdateUser(User user){
        userRepository.save(user);
    }

    public User getUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }
}
