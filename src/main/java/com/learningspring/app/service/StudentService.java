package com.learningspring.app.service;

import com.learningspring.app.dto.request.CreateStudentDto;
import com.learningspring.app.util.StudentUtils;
import org.springframework.stereotype.Service;

import static com.learningspring.app.util.StudentUtils.isValidEmail;

@Service
public class StudentService {
    public String addStudent(CreateStudentDto reqDto) {
         if (!isValidEmail(reqDto.getEmail())) {}
         return "";
    }
}
