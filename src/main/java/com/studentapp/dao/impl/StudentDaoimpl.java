package com.studentapp.dao.impl;

import com.studentapp.dao.StudentDao;
import com.studentapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
public class StudentDaoimpl implements StudentDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    // Implement methods here
    @Transactional
    public boolean saveStudent(Student student) {

        try {
            hibernateTemplate.save(student);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Student> getAllStudents() {
        return hibernateTemplate.loadAll(Student.class);
    }

    public Student getStudent(long id) {
        return hibernateTemplate.get(Student.class, id);

    }

    public boolean updateStudent(Student student) {

        hibernateTemplate.update(student);
        return true;

    }

    public boolean deleteStudent(long id) {

        Student student = hibernateTemplate.get(Student.class, id);
        hibernateTemplate.delete(student);
        return true;

    }
}