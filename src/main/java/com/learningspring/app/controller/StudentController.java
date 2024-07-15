package com.learningspring.app.controller;

import com.learningspring.app.dto.ResponseDto;
import com.learningspring.app.exceptions.StudentNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/all")
    public ResponseDto getStudents() {
        throw new StudentNotFoundException("Custom msg");
    }
}
