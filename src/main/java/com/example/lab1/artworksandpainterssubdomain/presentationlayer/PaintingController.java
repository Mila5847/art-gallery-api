package com.example.lab1.artworksandpainterssubdomain.presentationlayer;

import com.example.lab1.artworksandpainterssubdomain.businesslayer.PaintingService;
import com.example.lab1.artworksandpainterssubdomain.datalayer.Painting;
import com.mysql.cj.xdevapi.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/paintings")
public class PaintingController {

    PaintingService paintingService;

    public PaintingController(PaintingService paintingService) {
        this.paintingService = paintingService;
    }

    @GetMapping()
    public List<Painting> getPaintings(){
        return paintingService.getPaintings();
    }

}
