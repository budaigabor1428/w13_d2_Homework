package com.codeclan.example.RelationsHomework.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @JsonIgnore
    @OneToMany(mappedBy="folder", fetch = FetchType.LAZY)
    private List<File> files;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(
            name = "user_id",
            nullable=false)
    private User user;

    public Folder() {}

    public Folder(String title, User user) {
        this.title = title;
        this.files = new ArrayList<>();
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addFile(File file) {
        this.files.add(file);
    }
}