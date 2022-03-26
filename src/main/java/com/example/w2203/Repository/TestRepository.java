package com.example.w2203.Repository;

import com.example.w2203.Entity.TestTab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestTab, String> {
}
