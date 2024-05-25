package com.PetAdoption.API.rest;

import com.PetAdoption.API.dao.AdoptionApplication;
import com.PetAdoption.API.dao.Pet;
import com.PetAdoption.API.service.AdoptionApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("AdoptionApp")
public class AdoptionAppContoller {

    @Autowired
    AdoptionApplicationService adoptionApplicationService;

    @GetMapping
    List<AdoptionApplication> getAllAdoptionApps(){
        return adoptionApplicationService.getAllAdoptionApps();
    }

    @PostMapping
    AdoptionApplication createAdoptionApp(@RequestBody AdoptionApplication application){
        return adoptionApplicationService.createAdoptionApp(application);
    }

    @PutMapping
    AdoptionApplication updateAdoptionApp(@RequestBody AdoptionApplication application){
        return adoptionApplicationService.updateAdoptionApp(application);
    }

    @GetMapping("/{id}")
    Optional<AdoptionApplication> getAdoptionAppById(@PathVariable("id") Long id){
        return adoptionApplicationService.getAdoptionAppById(id);
    }

    @DeleteMapping("/{id}")
    void deleteAdoptionApp(@PathVariable("id") Long id){
        adoptionApplicationService.deleteAdoptionApp(id);
    }
}
