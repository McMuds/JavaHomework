package com.codeclan.files_homework;

import com.codeclan.files_homework.models.File;
import com.codeclan.files_homework.models.Folder;
import com.codeclan.files_homework.models.Person;
import com.codeclan.files_homework.repositories.FileRepository;
import com.codeclan.files_homework.repositories.FolderRepository;
import com.codeclan.files_homework.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesHomeworkApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveThings(){
		Person person = new Person("Claire");
		personRepository.save(person);
		Folder folder = new Folder("CodeClan_Work", person);
		folderRepository.save(folder);
		File file = new File("run_sql", ".py", 120, folder);
		fileRepository.save(file);
	}


}
