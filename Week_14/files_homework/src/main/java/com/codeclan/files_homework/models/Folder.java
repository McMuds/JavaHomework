package com.codeclan.files_homework.models;

import javax.persistence.*;

@Entity
@Table(name = "folders")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "folder_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Folder(String name, Person person) {
        this.name = name;
        this.person = person;
    }

    public Folder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
