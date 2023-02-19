package com.example.lab1.artvenuesandlocationsubdomain.businesslayer;

import com.example.lab1.artvenuesandlocationsubdomain.datalayer.Address;
import com.example.lab1.artvenuesandlocationsubdomain.datalayer.Gallery;
import com.example.lab1.artvenuesandlocationsubdomain.datalayer.GalleryRepository;
import com.example.lab1.artvenuesandlocationsubdomain.datamapperlayer.GalleryRequestMapper;
import com.example.lab1.artvenuesandlocationsubdomain.datamapperlayer.GalleryResponseMapper;
import com.example.lab1.artvenuesandlocationsubdomain.presentationlayer.GalleryRequestModel;
import com.example.lab1.artvenuesandlocationsubdomain.presentationlayer.GalleryResponseModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GalleryServiceImpl implements GalleryService{

    private GalleryRepository galleryRepository;
    private GalleryResponseMapper galleryResponseMapper;

    private GalleryRequestMapper galleryRequestMapper;

    public GalleryServiceImpl(GalleryRepository galleryRepository, GalleryResponseMapper galleryResponseMapper, GalleryRequestMapper galleryRequestMapper) {
        this.galleryRepository = galleryRepository;
        this.galleryResponseMapper = galleryResponseMapper;
        this.galleryRequestMapper = galleryRequestMapper;
    }

    @Override
    public List<GalleryResponseModel> getGalleries() {
        return galleryResponseMapper.entityListToResponseModelList(galleryRepository.findAll());
    }

    @Override
    public GalleryResponseModel getGalleryById(String galleryId) {
        Gallery gallery = galleryRepository.findByGalleryIdentifier_GalleryId(galleryId);
        return galleryResponseMapper.entityToResponseModel(gallery);
    }

    @Override
    public GalleryResponseModel addGallery(GalleryRequestModel galleryRequestModel) {
        Gallery gallery = galleryRequestMapper.requestModelToEntity(galleryRequestModel);
        Address address = new Address(galleryRequestModel.getStreetAddress(), galleryRequestModel.getCity(),
                galleryRequestModel.getProvince(), galleryRequestModel.getCountry(), galleryRequestModel.getPostalCode());
        gallery.setAddress(address);

        Gallery galleryToBeAdded = galleryRepository.save(gallery);
        GalleryResponseModel galleryResponse = galleryResponseMapper.entityToResponseModel(galleryToBeAdded);
        return galleryResponse;
    }

    @Override
    public GalleryResponseModel updateGallery(GalleryRequestModel galleryRequestModel, String galleryId) {
        Gallery gallery = galleryRequestMapper.requestModelToEntity(galleryRequestModel);
        Gallery existingGallery = galleryRepository.findByGalleryIdentifier_GalleryId(galleryId);
        if(existingGallery == null){
            return null;
        }
        gallery.setId(existingGallery.getId());
        gallery.setGalleryIdentifier(existingGallery.getGalleryIdentifier());
        Address address = new Address(galleryRequestModel.getStreetAddress(), galleryRequestModel.getCity(),
                galleryRequestModel.getProvince(), galleryRequestModel.getCountry(), galleryRequestModel.getPostalCode());
        gallery.setAddress(address);
        Gallery galleryToBeUpdated = galleryRepository.save(gallery);
        GalleryResponseModel galleryResponse = galleryResponseMapper.entityToResponseModel(galleryToBeUpdated);
        return galleryResponse;
    }

    @Override
    public void removeGalleries() {
        galleryRepository.deleteAll();
    }

    @Override
    public void removeGalleryById(String galleryId) {
        Gallery existingGallery = galleryRepository.findByGalleryIdentifier_GalleryId(galleryId);
        if(existingGallery == null){
            return;
        }
        galleryRepository.delete(existingGallery);
    }
}
