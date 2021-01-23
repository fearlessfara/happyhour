package com.faraone.happyhour.happyhour.controller;

import com.faraone.happyhour.happyhour.model.Image;
import com.faraone.happyhour.happyhour.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Controller
@RequestMapping("/image")
public class ImageController {
    @Autowired
    ImageService imageService;

    @GetMapping("/get/{id}")
    public Image getImage(@PathVariable("id") Long id) {
        return imageService.getImage(id);
    }



    @PostMapping("/upload")
    public RequestEntity.BodyBuilder uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
        System.out.println("Original Image Byte Size - " + file.getBytes().length);
        imageService.uploadImage(file);
        return (RequestEntity.BodyBuilder) ResponseEntity.status(HttpStatus.OK);
    }
}
