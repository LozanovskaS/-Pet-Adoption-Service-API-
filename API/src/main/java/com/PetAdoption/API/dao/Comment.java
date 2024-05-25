package com.PetAdoption.API.dao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date submittedAt;



    public Comment() {
    }

    public Comment(Pet pet, Users user, String content, Date submittedAt) {
        this.pet = pet;
        this.user = user;
        this.content = content;
        this.submittedAt = submittedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(Date submittedAt) {
        this.submittedAt = submittedAt;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", pet=" + pet +
                ", user=" + user +
                ", content='" + content + '\'' +
                ", submittedAt=" + submittedAt +
                '}';
    }
}
