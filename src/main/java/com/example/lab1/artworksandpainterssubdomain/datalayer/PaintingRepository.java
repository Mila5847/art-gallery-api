package com.example.lab1.artworksandpainterssubdomain.datalayer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaintingRepository extends JpaRepository<Painting, Integer> {

}
