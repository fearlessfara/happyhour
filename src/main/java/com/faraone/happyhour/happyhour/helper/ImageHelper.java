package com.faraone.happyhour.happyhour.helper;

import com.faraone.happyhour.happyhour.model.Image;
import com.faraone.happyhour.happyhour.repository.ImageRepository;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;


@Component
public class ImageHelper {

    private static final Logger logger = LoggerFactory.getLogger(ImageHelper.class);

    @Autowired
    ImageRepository imageRepository;

    public Boolean uploadImage(MultipartFile file) {
        try {
            Image img = new Image(file.getOriginalFilename(), file.getContentType(),
                    compressBytes(file.getBytes()));
            imageRepository.save(img);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Image getImage(Long imageId) {
        final Optional<Image> retrievedImage = imageRepository.findById(imageId);
        return retrievedImage.map(image -> new Image(image.getName(), image.getType(),
                decompressBytes(image.getPicByte()))).orElse(null);
    }

    public Boolean deleteImage(Long imageId) {
        if (BooleanUtils.isFalse(imageRepository.existsById(imageId))) {
            return false;
        }
        imageRepository.deleteImageById(imageId);
        return true;
    }

    // compress the image bytes before storing it in the database
    public static byte[] compressBytes(byte[] data) {
        Deflater deflater = new Deflater();
        deflater.setInput(data);
        deflater.finish();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] buffer = new byte[1024];
        while (!deflater.finished()) {
            int count = deflater.deflate(buffer);
            outputStream.write(buffer, 0, count);
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            logger.error(e.toString());
        }
        logger.info("Compressed Image Byte Size - " + outputStream.toByteArray().length);
        return outputStream.toByteArray();
    }


    // uncompress the image bytes before returning it to the angular application
    public static byte[] decompressBytes(byte[] data) {
        Inflater inflater = new Inflater();
        inflater.setInput(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] buffer = new byte[1024];
        try {
            while (!inflater.finished()) {
                int count = inflater.inflate(buffer);
                outputStream.write(buffer, 0, count);
            }
            outputStream.close();
        } catch (IOException | DataFormatException ioe) {
            logger.error(ioe.toString());
        }
        return outputStream.toByteArray();
    }

}
