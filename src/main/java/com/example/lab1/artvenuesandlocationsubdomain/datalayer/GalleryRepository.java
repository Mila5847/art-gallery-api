package com.example.lab1.artvenuesandlocationsubdomain.datalayer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GalleryRepository extends JpaRepository<Gallery, Integer> {
    Gallery findByGalleryIdentifier_GalleryId(String galleryId);
}
