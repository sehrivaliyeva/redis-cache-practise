package practise.rediscachepractise.controller;

import jakarta.persistence.Cacheable;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practise.rediscachepractise.entity.User;
import practise.rediscachepractise.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
