package com.digibnk.customer.mapper;

import com.digibnk.customer.dto.CustomerDTO;
import com.digibnk.customer.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO toDTO(Customer customer);
    Customer toEntity(CustomerDTO customerDTO);
    void updateEntityFromDTO(CustomerDTO dto, @MappingTarget Customer entity);
}
