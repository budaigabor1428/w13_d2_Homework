package com.codeclan.example.RelationsHomework.repositories;

import com.codeclan.example.RelationsHomework.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
