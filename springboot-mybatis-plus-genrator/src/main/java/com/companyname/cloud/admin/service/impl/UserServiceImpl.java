package com.companyname.cloud.admin.service.impl;

import com.companyname.cloud.admin.entity.User;
import com.companyname.cloud.admin.mapper.UserMapper;
import com.companyname.cloud.admin.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author default
 * @since 2020-05-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
