package com.cjl.cloud.provider.dao;

import com.cjl.cloud.provider.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
