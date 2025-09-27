package com.gulkalkan.service.impl;

import com.gulkalkan.dto.DtoAddress;
import com.gulkalkan.dto.DtoGallerist;
import com.gulkalkan.dto.DtoGalleristIU;
import com.gulkalkan.exception.BaseException;
import com.gulkalkan.exception.ErrorMessage;
import com.gulkalkan.exception.MessageType;
import com.gulkalkan.model.Address;
import com.gulkalkan.model.Gallerist;
import com.gulkalkan.repository.AddressRepository;
import com.gulkalkan.repository.GalleristRepository;
import com.gulkalkan.service.IGalleristService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class GallleristServiceImpl implements IGalleristService {

    @Autowired
    private GalleristRepository galleristRepository;

    @Autowired
    private AddressRepository addressRepository;

    private Gallerist createGallerist(DtoGalleristIU dtoGalleristIU) {

      Optional < Address> optAddress = addressRepository.findById(dtoGalleristIU.getAddressId());

      if (optAddress.isEmpty()){
          throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,dtoGalleristIU.getAddressId().toString()));
      }
        Gallerist gallerist = new Gallerist();
        gallerist.setCreateTime(new Date());

        BeanUtils.copyProperties(dtoGalleristIU, gallerist);

        gallerist.setAddress(optAddress.get());


        return gallerist;
    }

    @Override
    public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU) {
     DtoGallerist dtoGallerist = new DtoGallerist();

        DtoAddress dtoAddress = new DtoAddress();


        Gallerist savedGallerist= galleristRepository.save(createGallerist(dtoGalleristIU)) ;
     BeanUtils.copyProperties(savedGallerist, dtoGallerist);
     BeanUtils.copyProperties(savedGallerist.getAddress(),dtoAddress);
     dtoGallerist.setAddress(dtoAddress);
        return  dtoGallerist;
    }
}
