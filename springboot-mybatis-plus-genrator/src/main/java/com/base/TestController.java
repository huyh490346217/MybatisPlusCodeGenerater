package com.base;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.companyname.cloud.admin.entity.User;
import com.companyname.cloud.admin.service.IUserService;
import com.utils.R;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author default
 * @since 2019-10-14
 */
@RestController
@RequestMapping("/testusers")
@AllArgsConstructor
public class TestController {

    IUserService userService;

    //http://localhost:7070/testusers/info/Sandy
    @GetMapping("/info/{userName}")
    public R getUser(@PathVariable String userName){
//        Users user = usersService.getOne(Wrappers.query()
////                .lambda().eq(Users::getUsername, userName));

        User user = new User();
        user.setName(userName);
        user = userService.getOne(new QueryWrapper<>(user));
        System.out.println("user : " + user);
        if (user == null) {
            return new R<>(Boolean.FALSE, "获取当前用户信息失败");
        }
        return new R<>(user);
    }

    //http://localhost:7070/testusers/getUserListByPage?pageNumber=1&pageSize=2
    //条件分页查询
    @GetMapping("getUserListByPage")
    public R getUserListByPage(Integer pageNumber, Integer pageSize)
    {
        Page<User> page =new Page<>(pageNumber,pageSize);
//        EntityWrapper<Users> entityWrapper = new EntityWrapper<>();
//        entityWrapper.eq("user_name", "xiaoli");
        return new R<>(userService.page(page));
    }

    //http://localhost:7070/testusers/getUserListByPageObject?current=1&size=2
    //条件分页查询
    @GetMapping("getUserListByPageObject")
    public R getUserListByPageObject(Page page)
    {
//        Page<Users> page =new Page<>(pageNumber,pageSize);
//        EntityWrapper<Users> entityWrapper = new EntityWrapper<>();
//        entityWrapper.eq("user_name", "xiaoli");
        return new R<>(userService.page(page));
    }
}
