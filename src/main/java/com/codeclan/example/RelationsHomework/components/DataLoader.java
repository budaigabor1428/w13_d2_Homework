package com.codeclan.example.RelationsHomework.components;

import com.codeclan.example.RelationsHomework.Model.File;
import com.codeclan.example.RelationsHomework.Model.Folder;
import com.codeclan.example.RelationsHomework.Model.User;
import com.codeclan.example.RelationsHomework.repositories.FileRepository;
import com.codeclan.example.RelationsHomework.repositories.FolderRepository;
import com.codeclan.example.RelationsHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        User user1 = new User("John Smith");
        userRepository.save(user1);

        Folder folder1 = new Folder("MyFiles", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("MyDocs", user1);
        folderRepository.save(folder2);

        File file1 = new File("homework", ".doc", 1024, folder1);
        fileRepository.save(file1);
        File file2 = new File("calculations", ".xcl", 1020, folder1);
        fileRepository.save(file1);

        user1.addFolder(folder1);
        user1.addFolder(folder2);
        userRepository.save(user1);

        folder1.addFile(file1);
        folder1.addFile(file2);
        folderRepository.save(folder1);
        }
}
