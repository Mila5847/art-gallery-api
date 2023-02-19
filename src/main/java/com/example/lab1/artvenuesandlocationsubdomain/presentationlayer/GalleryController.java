package com.example.lab1.artvenuesandlocationsubdomain.presentationlayer;

import com.example.lab1.artvenuesandlocationsubdomain.businesslayer.GalleryService;
import com.example.lab1.artvenuesandlocationsubdomain.datalayer.Gallery;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/galleries")
public class GalleryController {
    GalleryService galleryService;

    public GalleryController(GalleryService galleryService) {
        this.galleryService = galleryService;
    }

    @GetMapping
    public List<GalleryResponseModel> getGalleries(){
        return galleryService.getGalleries();
    }

    @GetMapping("/{galleryId}")
    public GalleryResponseModel getGalleryById(@PathVariable String galleryId){
        return galleryService.getGalleryById(galleryId);
    }

    @PostMapping
    public GalleryResponseModel addGallery(@RequestBody GalleryRequestModel galleryRequestModel){
        return galleryService.addGallery(galleryRequestModel);
    }

    @PutMapping("/{galleryId}")
    public GalleryResponseModel updateGallery(@RequestBody GalleryRequestModel galleryRequestModel, @PathVariable String galleryId){
        return galleryService.updateGallery(galleryRequestModel, galleryId);
    }

    @DeleteMapping
    public void removeGalleries(){
        galleryService.removeGalleries();
    }

    @DeleteMapping("{galleryId}")
    public void removeGalleryById(@PathVariable String galleryId){
        galleryService.removeGalleryById(galleryId);
    }
}
