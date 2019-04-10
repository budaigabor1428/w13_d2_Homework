package com.codeclan.example.RelationsHomework.repositories;

import com.codeclan.example.RelationsHomework.Model.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
