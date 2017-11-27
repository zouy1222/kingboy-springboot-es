package com.kingboy.controller.user;

import com.kingboy.repository.UserRepository;
import com.kingboy.repository.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/11/27 下午10:13
 * @desc 用户搜索添加.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserRepository userRepository;

    @PostMapping
    public void saveUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @PostMapping("/list")
    public void saveUsers(@RequestBody List<User> users) {
        userRepository.save(users);
    }

    @GetMapping("/username/{username}")
    public List<User> getUserByUsername(@PathVariable String username) {
        return userRepository.findByUsername(username);
    }
}
