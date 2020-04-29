package com.kyo.schoolweb.dao;

import com.kyo.schoolweb.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User,Long> {

    public User findUserByUsername(String username);

}
