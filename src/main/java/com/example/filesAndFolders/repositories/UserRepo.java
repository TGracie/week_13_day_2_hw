package com.example.filesAndFolders.repositories;

import com.example.filesAndFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
