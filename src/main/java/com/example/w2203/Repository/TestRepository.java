package com.example.w2203.Repository;

import com.example.w2203.Entity.TestTab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "test1")
public interface TestRepository extends JpaRepository<TestTab, String> {
}
