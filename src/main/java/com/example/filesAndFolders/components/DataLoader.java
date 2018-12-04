package com.example.filesAndFolders.components;

import com.example.filesAndFolders.models.File;
import com.example.filesAndFolders.models.Folder;
import com.example.filesAndFolders.models.User;
import com.example.filesAndFolders.repositories.FileRepo;
import com.example.filesAndFolders.repositories.FolderRepo;
import com.example.filesAndFolders.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepo fileRepo;

    @Autowired
    FolderRepo folderRepo;

    @Autowired
    UserRepo userRepo;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User tom = new User("Thomas");
        userRepo.save(tom);

        Folder docs = new Folder("Documents", tom);
        folderRepo.save(docs);

        File resume = new File("My CV", ".word", 22, docs);
        fileRepo.save(resume);
    }
}
