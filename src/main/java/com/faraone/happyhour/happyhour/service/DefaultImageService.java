package com.faraone.happyhour.happyhour.service;

import com.faraone.happyhour.happyhour.helper.ImageHelper;
import com.faraone.happyhour.happyhour.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class DefaultImageService implements ImageService {


    @Autowired
    ImageHelper imageHelper;


    @Override
    public Image getImage(Long imageId) {
        return imageHelper.getImage(imageId);
    }

    @Override
    public Boolean uploadImage(MultipartFile file){
        return imageHelper.uploadImage(file);
    }

    @Override
    public Boolean deleteImage(Long imageId) {
        return imageHelper.deleteImage(imageId);
    }


}
