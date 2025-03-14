package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        List<StudentCourse> studentCourses;
        studentCourses = studentCourseRepository.findAllByOrderByStudentIdAsc();
        return studentCourses;
    }

    public Optional<Student> findStudentWithHighestGpa() {
        Student highestGpaStudent = studentRepository.findFirstByOrderByGpaDesc();
        return Optional.ofNullable(highestGpaStudent);
    }

    public String joinStudentNames() {
        List<String> studentNames = studentRepository.findAllName();
        StringBuilder resultBuilder = new StringBuilder();
        for (String studentName : studentNames) {
            resultBuilder.append(studentName);
            resultBuilder.append(", ");
        }
        int resultLength = resultBuilder.length();
        try {
            resultBuilder.delete(resultLength - 2, resultLength);
        } catch (StringIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        String result = resultBuilder.toString();
        return result;    }
}

