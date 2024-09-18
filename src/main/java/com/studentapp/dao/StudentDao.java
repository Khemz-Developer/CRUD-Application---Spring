package com.studentapp.dao;

import com.studentapp.entity.Student;

import java.util.List;


public interface StudentDao {

        public boolean saveStudent(Student student);

        public List<Student> getAllStudents(); //pagination

        public Student getStudent(long id);

        public boolean updateStudent(Student student);

        public boolean deleteStudent(long id);



    }

