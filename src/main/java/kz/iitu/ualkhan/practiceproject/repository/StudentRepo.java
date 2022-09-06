package kz.iitu.ualkhan.practiceproject.repository;

import kz.iitu.ualkhan.practiceproject.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentRepo {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = true)
    public List<Student> getAllStudents(){
        return sessionFactory.getCurrentSession().createQuery("from Student s").list();
    }

    @Transactional
    public void saveStudent(Student student){
        sessionFactory.getCurrentSession().save(student);
    }

}
