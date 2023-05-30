package com.codeclan.files_homework.components;

import com.codeclan.files_homework.models.File;
import com.codeclan.files_homework.models.Folder;
import com.codeclan.files_homework.models.Person;
import com.codeclan.files_homework.repositories.FileRepository;
import com.codeclan.files_homework.repositories.FolderRepository;
import com.codeclan.files_homework.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
//@Component //Comment this out if you do not to run the data loader.
public class DataLoader implements ApplicationRunner{
    @Autowired
    PersonRepository personRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Person claire = new Person("Claire");
        personRepository.save(claire);
        Person toby = new Person("Toby");
        personRepository.save(toby);
        Person jasper = new Person("Jasper");
        personRepository.save(jasper);
        Person andrew = new Person("Andrew");
        personRepository.save(andrew);
        Person keith = new Person("Keith");
        personRepository.save(keith);
        Person mar = new Person("Mar");
        personRepository.save(mar);

        Folder marHome = new Folder("Home", mar);
        folderRepository.save(marHome);
        Folder marWork = new Folder("Work", mar);
        folderRepository.save(marWork);
        Folder tobyFolder = new Folder("Home", toby);
        folderRepository.save(tobyFolder);
        Folder claire1 = new Folder("Work Stuff", claire);
        folderRepository.save(claire1);
        Folder jasper1 = new Folder("Steam Games", jasper);
        folderRepository.save(jasper1);
        Folder andrew1 = new Folder("Dr Who Eps", andrew);
        folderRepository.save(andrew1);
        Folder keith1 = new Folder("Funky Knowledge Stuff", keith);
        folderRepository.save(keith1);

        File keithFile = new File("abc", ".py",  120, keith1);
        fileRepository.save(keithFile);
        File marFile = new File("efg", ".py",  120, marHome);
        fileRepository.save(marFile);
        File tobyFile = new File("hij", ".py",  120, tobyFolder);
        fileRepository.save(tobyFile);
        File jasperFile = new File("klm", ".py",  120, jasper1);
        fileRepository.save(jasperFile);
        File andrewFile = new File("nop", ".py",  120, andrew1);
        fileRepository.save(andrewFile);
        File claireFile = new File("qrs", ".py",  120, claire1);
        fileRepository.save(claireFile);
        File mar2File = new File("tuv", ".py",  120, marWork);
        fileRepository.save(mar2File);
        File claire2File = new File("xyz", ".py",  120, claire1);
        fileRepository.save(claire2File);
        File toby2File = new File("ABC", ".py",  120, tobyFolder);
        fileRepository.save(toby2File);

    }






}
