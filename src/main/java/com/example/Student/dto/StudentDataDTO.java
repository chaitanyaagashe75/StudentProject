package com.example.Student.dto;

import com.example.Student.model.Address;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class StudentDataDTO {

    private String id;
    private String name;
    private int age ;
    private List<Address> AddressList;

}
