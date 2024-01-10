package com.adityashinde.api.repository;

import com.adityashinde.api.dto.UserRequest;
import com.adityashinde.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(Integer id);
}
