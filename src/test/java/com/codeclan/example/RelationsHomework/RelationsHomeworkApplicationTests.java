package com.codeclan.example.RelationsHomework;

import com.codeclan.example.RelationsHomework.Model.File;
import com.codeclan.example.RelationsHomework.Model.Folder;
import com.codeclan.example.RelationsHomework.Model.User;
import com.codeclan.example.RelationsHomework.repositories.FileRepository;
import com.codeclan.example.RelationsHomework.repositories.FolderRepository;
import com.codeclan.example.RelationsHomework.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationsHomeworkApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void testSaveAndAdd() {
//		User user1 = new User("John Smith");
//		userRepository.save(user1);
//
//		Folder folder1 = new Folder("MyFiles", user1);
//		folderRepository.save(folder1);
//
//		File file1 = new File("homework", ".doc", 1024, folder1);
//		fileRepository.save(file1);
//
//		user1.addFolder(folder1);
//		userRepository.save(user1);
//
//		folder1.addFile(file1);
//		folderRepository.save(folder1);
//
//	}

}
