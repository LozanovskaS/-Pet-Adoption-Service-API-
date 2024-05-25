package com.PetAdoption.API.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {
    List<Pet> findPetBySpecies(String species);
    List<Pet> findPetByBreed(String breed);
    List<Pet> findPetByStatus(String status);

    @Query("select p from Pet p where p.age <= :maxAge")
    List<Pet> findPetByMaxAge(@Param("maxAge") int maxAge);
}
