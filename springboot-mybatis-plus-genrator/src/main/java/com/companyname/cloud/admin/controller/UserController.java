package com.companyname.cloud.admin.controller;


import com.companyname.cloud.admin.entity.User;
import com.companyname.cloud.admin.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author default
 * @since 2020-05-17
 */
@RestController
@RequestMapping("/admin/user")
@AllArgsConstructor
public class UserController {
    IUserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String id ){
        User user = userService.getById(id);
        return user;
    }

    @PostMapping()
    public String saveUser(User user){
        boolean save = userService.save(user);
        String userId = "";
        if (save){
            userId = user.getId();
        }
        return userId;
    }
}
