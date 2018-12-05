package com.example.filesAndFolders;

import com.example.filesAndFolders.models.File;
import com.example.filesAndFolders.models.Folder;
import com.example.filesAndFolders.models.User;
import com.example.filesAndFolders.repositories.FileRepo;
import com.example.filesAndFolders.repositories.FolderRepo;
import com.example.filesAndFolders.repositories.UserRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesAndFoldersApplicationTests {

	@Autowired
	UserRepo userRepo;

	@Autowired
	FolderRepo folderRepo;

	@Autowired
	FileRepo fileRepo;

	@Test
	public void contextLoads() {
	}

	@Test
    public void canCreateUser(){
        User user = new User("Bob");
        userRepo.save(user);
    }

    @Test
    public void canCreateFolder(){
	    User user = new User("Frankie");
	    userRepo.save(user);
	    Folder folder = new Folder("Notes", user);
	    folderRepo.save(folder);
    }

    @Test
    public void canCreateFile(){
        User user = new User("Flarb");
        userRepo.save(user);

        Folder folder = new Folder("Nurts", user);
        folderRepo.save(folder);

	    File file = new File("Notes from today", ".word", 35, folder);
	    fileRepo.save(file);
    }

}
