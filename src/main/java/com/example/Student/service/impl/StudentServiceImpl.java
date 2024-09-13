package com.example.Student.service.impl;

import com.example.Student.dto.StudentDataDTO;
import com.example.Student.model.Address;
import com.example.Student.model.Student;
import com.example.Student.repository.AddressRepository;
import com.example.Student.repository.StudentRepository;
import com.example.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudentServiceImpl implements StudentService {
             @Autowired
             private StudentRepository studentRepository;

    @Override
    public Student addStudentData(Student student) {
        return studentRepository.save(student);
    }


}
