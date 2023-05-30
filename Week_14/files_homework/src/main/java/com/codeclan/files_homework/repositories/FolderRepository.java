package com.codeclan.files_homework.repositories;

import com.codeclan.files_homework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
