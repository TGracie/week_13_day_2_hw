package com.example.filesAndFolders.repositories;

import com.example.filesAndFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepo extends JpaRepository<Folder, Long> {
}
