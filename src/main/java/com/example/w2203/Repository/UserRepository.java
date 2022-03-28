package com.example.w2203.Repository;

import com.example.w2203.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User,String> {
}
