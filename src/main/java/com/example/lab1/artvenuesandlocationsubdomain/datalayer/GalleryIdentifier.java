package com.example.lab1.artvenuesandlocationsubdomain.datalayer;

import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class GalleryIdentifier {
    private String galleryId;

    public GalleryIdentifier() {
        this.galleryId = UUID.randomUUID().toString();
    }

    public String getGalleryId() {
        return galleryId;
    }


}
