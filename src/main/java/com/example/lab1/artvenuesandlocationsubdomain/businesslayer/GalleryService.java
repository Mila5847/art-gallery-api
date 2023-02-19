package com.example.lab1.artvenuesandlocationsubdomain.businesslayer;

import com.example.lab1.artvenuesandlocationsubdomain.datalayer.Gallery;
import com.example.lab1.artvenuesandlocationsubdomain.datalayer.GalleryRepository;
import com.example.lab1.artvenuesandlocationsubdomain.presentationlayer.GalleryRequestModel;
import com.example.lab1.artvenuesandlocationsubdomain.presentationlayer.GalleryResponseModel;

import java.util.List;

public interface GalleryService {
    List<GalleryResponseModel> getGalleries();
    GalleryResponseModel getGalleryById(String galleryID);
    GalleryResponseModel addGallery(GalleryRequestModel galleryRequestModel);
    GalleryResponseModel updateGallery(GalleryRequestModel galleryRequestModel, String galleryId);

    void removeGalleries();
    void removeGalleryById(String galleryId);

}
