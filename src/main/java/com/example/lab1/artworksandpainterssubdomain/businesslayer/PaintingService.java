package com.example.lab1.artworksandpainterssubdomain.businesslayer;

import com.example.lab1.artworksandpainterssubdomain.datalayer.Painting;

import java.util.List;

public interface PaintingService {
    List<Painting> getPaintings();
}
