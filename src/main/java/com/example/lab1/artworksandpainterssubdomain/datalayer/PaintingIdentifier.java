package com.example.lab1.artworksandpainterssubdomain.datalayer;

import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class PaintingIdentifier {
    private String paintingId;

    PaintingIdentifier() {
        this.paintingId = UUID.randomUUID().toString();
    }

    public String getClientId(){
        return paintingId;
    }

}
