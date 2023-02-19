package com.example.lab1.artvenuesandlocationsubdomain.datamapperlayer;

import com.example.lab1.artvenuesandlocationsubdomain.datalayer.Gallery;
import com.example.lab1.artvenuesandlocationsubdomain.presentationlayer.GalleryResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GalleryResponseMapper {
    @Mapping(expression = "java(gallery.getGalleryIdentifier().getGalleryId())",  target = "galleryId")
    @Mapping(expression = "java(gallery.getAddress().getStreetAddress())", target = "streetAddress" )
    @Mapping(expression = "java(gallery.getAddress().getCity())", target = "city" )
    @Mapping(expression = "java(gallery.getAddress().getProvince())", target = "province" )
    @Mapping(expression = "java(gallery.getAddress().getCountry())", target = "country" )
    @Mapping(expression = "java(gallery.getAddress().getPostalCode())", target = "postalCode" )
    GalleryResponseModel entityToResponseModel(Gallery gallery);

    List<GalleryResponseModel> entityListToResponseModelList(List<Gallery> galleries);
}
