package bm.bladmanagement.controllers;

import bm.bladmanagement.services.IArtistService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {

    private IArtistService artistService;

    public ArtistController(IArtistService artistService){
        this.artistService = artistService;
    }
}
