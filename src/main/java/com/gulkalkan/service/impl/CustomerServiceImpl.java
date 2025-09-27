package com.gulkalkan.service.impl;

import com.gulkalkan.dto.DtoAccount;
import com.gulkalkan.dto.DtoAddress;
import com.gulkalkan.dto.DtoCustomer;
import com.gulkalkan.dto.DtoCustomerIU;
import com.gulkalkan.exception.BaseException;
import com.gulkalkan.exception.ErrorMessage;
import com.gulkalkan.exception.MessageType;
import com.gulkalkan.model.Account;
import com.gulkalkan.model.Address;
import com.gulkalkan.model.Customer;
import com.gulkalkan.repository.AccountRepository;
import com.gulkalkan.repository.AddressRepository;
import com.gulkalkan.repository.CustomerRepository;
import com.gulkalkan.service.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AddressRepository addressRepository;

    private Customer createCustomer(DtoCustomerIU dtoCustomerIU) {

        Optional<Address> optAddress =addressRepository.findById(dtoCustomerIU.getAddressId());
       if (optAddress.isEmpty()){
           throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,dtoCustomerIU.getAddressId().toString()));
       }
       Optional<Account> optAccount =accountRepository.findById(dtoCustomerIU.getAccountId());
        if (optAccount.isEmpty()){
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,dtoCustomerIU.getAccountId().toString()));
        }

        Customer customer = new Customer();
        customer.setCreateTime(new Date());
        BeanUtils.copyProperties(dtoCustomerIU, customer);


        customer.setAddress(optAddress.get());
        customer.setAccount(optAccount.get());

        return customer;
    }

    @Override
    public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU) {
       DtoCustomer dtoCustomer = new DtoCustomer();
        DtoAddress dtoAddress = new DtoAddress();
        DtoAccount dtoAccount = new DtoAccount();


        Customer savedCustomer= customerRepository.save(createCustomer(dtoCustomerIU));

        BeanUtils.copyProperties(savedCustomer, dtoCustomer);
        BeanUtils.copyProperties(savedCustomer.getAddress(),dtoAddress);
        BeanUtils.copyProperties(savedCustomer.getAccount(),dtoAccount);

        dtoCustomer.setAddress(dtoAddress);
        dtoCustomer.setAccount(dtoAccount);

        return dtoCustomer;
    }
}
