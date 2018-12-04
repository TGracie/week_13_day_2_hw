package com.example.filesAndFolders.repositories;


import com.example.filesAndFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends JpaRepository<File, Long> {
}
