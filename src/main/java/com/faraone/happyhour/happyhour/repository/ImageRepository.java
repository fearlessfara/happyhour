package com.faraone.happyhour.happyhour.repository;

import com.faraone.happyhour.happyhour.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
    void deleteImageById(Long id);

    class Projection {
        interface ImageId {
            Long getId();
        }
    }
}
