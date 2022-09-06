package kz.iitu.ualkhan.practiceproject.service;

import kz.iitu.ualkhan.practiceproject.model.Student;
import kz.iitu.ualkhan.practiceproject.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public List<Student> getAllStudents(){
        return  repo.getAllStudents();
    }

    public void saveStudent(Student student){
        repo.saveStudent(student);
    }
}
