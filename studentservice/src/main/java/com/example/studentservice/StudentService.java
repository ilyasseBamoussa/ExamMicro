package com.example.studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudent(long id,Student student){
        if(studentRepository.existsById(id)){
            student.setId(id);
           return studentRepository.save(student);
        }
        else {
            return null;
        }
    }

    public void deleteStudent(long id){
         studentRepository.deleteById(id);
    }

}
