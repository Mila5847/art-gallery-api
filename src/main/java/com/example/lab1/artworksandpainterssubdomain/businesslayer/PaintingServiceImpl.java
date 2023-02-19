package com.example.lab1.artworksandpainterssubdomain.businesslayer;

import com.example.lab1.artworksandpainterssubdomain.datalayer.Painting;
import com.example.lab1.artworksandpainterssubdomain.datalayer.PaintingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaintingServiceImpl implements PaintingService{

    PaintingRepository paintingRepository;

    public PaintingServiceImpl(PaintingRepository paintingRepository) {
        this.paintingRepository = paintingRepository;
    }

    @Override
    public List<Painting> getPaintings() {
        return paintingRepository.findAll();
    }
}
