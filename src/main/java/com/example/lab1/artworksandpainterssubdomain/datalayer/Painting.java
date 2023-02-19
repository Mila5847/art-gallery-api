package com.example.lab1.artworksandpainterssubdomain.datalayer;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="paintings")
@Entity
@Data
public class Painting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String title;
    private int year;

    @Embedded
    private PaintingIdentifier paintingIdentifier;

    public Painting() {
        this.paintingIdentifier = new PaintingIdentifier();
    }

    public Painting(String title, int year) {
        this.paintingIdentifier = new PaintingIdentifier();
        this.title = title;
        this.year = year;
    }
}
