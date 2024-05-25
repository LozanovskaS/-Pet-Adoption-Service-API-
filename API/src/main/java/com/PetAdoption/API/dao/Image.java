package com.PetAdoption.API.dao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    private String url;
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedAt;

    public Image(Pet pet, String url, String description, Date addedAt) {
        this.pet = pet;
        this.url = url;
        this.description = description;
        this.addedAt = addedAt;
    }

    public Image() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(Date addedAt) {
        this.addedAt = addedAt;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", pet=" + pet +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", addedAt=" + addedAt +
                '}';
    }
}
