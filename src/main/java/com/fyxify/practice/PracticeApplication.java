package com.fyxify.practice;
//
//import com.fyxify.practice.dao.StudentDAO;
//import com.fyxify.practice.dao.StudentDAOImplRepo;
import com.fyxify.practice.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
//(scanBasePackages = {"com.fyxify.practice", "util"})
public class PracticeApplication {

//    private final StudentDAOImplRepo studentDAOImplRepo;
//
//    public PracticeApplication(StudentDAOImplRepo studentDAOImplRepo) {
//        this.studentDAOImplRepo = studentDAOImplRepo;
//    }

    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
//        return args -> {
////            createStudent(studentDAO);
////            readStudent(studentDAO);
////            listOfStudent(studentDAO);
////            findStudentByName(studentDAO);
////            updateStudent(studentDAO);
////            destroyStudent(studentDAO);
//        };
//    }
//
//    private void destroyStudent(StudentDAO studentDAO) {
//        System.out.println("Deleting student...");
//        long id = 1;
//        studentDAO.delete(id);
//        System.out.println("Student has been deleted");
//    }
//
//    private void updateStudent(StudentDAO studentDAO) {
//        System.out.println("updating Student...");
//        long id = 3;
//        Student student = studentDAO.findById(id);
//        student.setName("Talha");
//        studentDAO.update(student);
//        System.out.println("Data has been updated:" + student);
//    }
//
//    private void findStudentByName(StudentDAO studentDAO) {
//        System.out.println("Getting Student list...");
//        List<Student> studentList = studentDAO.findByName("amigo");
//
//        for (Student student : studentList) {
//            System.out.println(student);
//        }
//
//    }
//
//    private void listOfStudent(StudentDAO studentDAO) {
//        System.out.println("Getting Student list...");
//        List<Student> studentList = studentDAO.findAll();
//
//        for (Student student : studentList) {
//            System.out.println(student);
//        }
//    }
//
//    private void createStudent(StudentDAO studentDAO) {
//        System.out.println("Create new student...");
//        Student student = new Student(LocalDate.now(), 24, "joe@gmail.com", "Joe Smith");
//
//        System.out.println("Saving new student...");
//        studentDAO.save(student);
//
//        System.out.println("New Student saved. With Id: " + student.getId());
//    }
//
//    private void readStudent(StudentDAO studentDAO) {
//        System.out.println("Create new student...");
//        Student student = new Student(LocalDate.now(), 24, "joe@gmail.com", "Joe Smith");
//
//        System.out.println("Saving new student...");
//        studentDAO.save(student);
//
//        System.out.println("New Student saved. With Id: " + student.getId());
//
//        System.out.println("Read Student saved. With Id: " + student.getId());
//        Student studentData = studentDAO.findById(student.getId());
//
//        System.out.println("Read Student data: " + studentData);
//    }

}
