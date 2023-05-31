package com.codeclan.files_homework.controllers;

import com.codeclan.files_homework.models.Folder;
import com.codeclan.files_homework.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FolderController {
    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity getFolderById(@PathVariable Long id){
        Optional<Folder> foundFolder = folderRepository.findById(id);
        return new ResponseEntity(foundFolder, HttpStatus.OK);
    }

    @PostMapping(value = "/folders")
    public ResponseEntity postFolder(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity(folder, HttpStatus.CREATED);
    }
}
