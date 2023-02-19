package com.example.lab1.artvenuesandlocationsubdomain.datamapperlayer;

import com.example.lab1.artvenuesandlocationsubdomain.datalayer.Gallery;
import com.example.lab1.artvenuesandlocationsubdomain.presentationlayer.GalleryRequestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GalleryRequestMapper {
    @Mapping(target = "galleryIdentifier", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    Gallery requestModelToEntity(GalleryRequestModel galleryRequestModel);
}
