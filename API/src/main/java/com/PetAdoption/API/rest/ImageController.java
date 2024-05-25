package com.PetAdoption.API.rest;

import com.PetAdoption.API.dao.Image;
import com.PetAdoption.API.dao.Pet;
import com.PetAdoption.API.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("image")
public class ImageController {

    @Autowired
    ImageService imageService;

    @GetMapping
    List<Image> getAllImages(){
        return imageService.getAllImages();
    }

    @PostMapping
    Image createImage(@RequestBody Image image){
        return imageService.createImage(image);
    }

    @PutMapping
    Image updateImage(@RequestBody Image image){
        return imageService.createImage(image);
    }

    @GetMapping("/{id}")
    Optional<Image> getImageById(@PathVariable("id") Long id){
        return imageService.getImageById(id);
    }

    @DeleteMapping("/{id}")
    void deleteImage(@PathVariable("id") Long id){
       imageService.deleteImage(id);
    }
}
