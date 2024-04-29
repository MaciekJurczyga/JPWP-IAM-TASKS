package com.atis.zadanie1.UserService;

import com.atis.zadanie1.Etnity.User;
import com.atis.zadanie1.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    // należy stworzyć pole private final naszego Repository, nazwij ją userRepository

    // należy użyć adontacji @Autowired, która
    public UserService(Repository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

}
