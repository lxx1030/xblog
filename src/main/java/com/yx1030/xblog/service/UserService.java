package com.yx1030.xblog.service;

import com.yx1030.xblog.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUserById(Integer id);
}
