package com.codeclan.files_homework;

import com.codeclan.files_homework.models.Folder;
import com.codeclan.files_homework.models.Person;
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

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveThings(){
		Person person = new Person("Claire");
		personRepository.save(person);
		Folder folder = new Folder("CodeClan_Work", person);
		folderRepository.save(folder);
	}


}
