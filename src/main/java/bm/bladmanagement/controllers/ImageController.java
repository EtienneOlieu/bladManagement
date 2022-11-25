package bm.bladmanagement.controllers;

import bm.bladmanagement.services.IImageService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    private IImageService imageService;

    public ImageController(IImageService imageService){
        this.imageService = imageService;
    }
}
