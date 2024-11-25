package practise.rediscachepractise.service;


import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import practise.rediscachepractise.entity.User;
import practise.rediscachepractise.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Cacheable(value = "users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
