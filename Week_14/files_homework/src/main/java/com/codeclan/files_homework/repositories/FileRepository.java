package com.codeclan.files_homework.repositories;

import com.codeclan.files_homework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
