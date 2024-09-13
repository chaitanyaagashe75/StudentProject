package com.example.Student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {
    @Id
    private String AddressId;
    private String city;
    private String landmark;
    private int picode;

    @Column(nullable =false)
    private String studentId;

}
