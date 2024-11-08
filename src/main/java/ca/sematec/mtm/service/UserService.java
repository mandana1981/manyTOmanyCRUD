package ca.sematec.mtm.service;



import ca.sematec.mtm.model.User;
import ca.sematec.mtm.repository.RoleRepository;
import ca.sematec.mtm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    public User getByIdUser(int id) {
        return userRepository.findById(id).get();
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
      return   userRepository.save(user);
    }

    public User deleteUser(int id) {

        return userRepository.findById(id).get();

    }
    public User updateUser(User user) {
        return userRepository.save(user);
    }
//
//    public User updateUser(User user) {
//
//
//    }

}
