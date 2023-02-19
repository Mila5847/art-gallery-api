package com.example.lab1.artvenuesandlocationsubdomain.presentationlayer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GalleryResponseModel {
    private String galleryId;
    private String name;
    private String openFrom;
    private String openUntil;
    private String streetAddress;
    private String city;
    private String province;
    private String country;
    private String postalCode;
}
