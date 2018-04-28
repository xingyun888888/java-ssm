package com.gaochao.dao;

import com.gaochao.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by smileMAC on 18/4/28.
 */
@Repository
public interface UserDao {
    List<User> getUserByUserName(String name);
}
