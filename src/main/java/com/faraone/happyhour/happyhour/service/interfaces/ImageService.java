package com.faraone.happyhour.happyhour.service.interfaces;

import com.faraone.happyhour.happyhour.model.Image;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    Image getImage(Long imageId);

    Boolean uploadImage(MultipartFile file);

    Boolean deleteImage(Long imageId);
}
