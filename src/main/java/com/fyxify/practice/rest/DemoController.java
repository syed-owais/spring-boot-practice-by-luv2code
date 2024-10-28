package com.fyxify.practice.rest;

import com.fyxify.practice.common.Coach;
//import com.fyxify.practice.dao.StudentDAO;
import com.fyxify.practice.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class DemoController {

//    private final StudentDAO studentDAO;
//    private Coach coach;
//    private Coach coach2;
//
////    @Autowired
////    public DemoController(Coach theCoach) {
////        coach = theCoach;
////    }
//
////    @Autowired
//////    public void setCoach(@Qualifier("cricketCoach") Coach theCoach,@Qualifier("cricketCoach") Coach theCoach2) {
////    public void setCoach(@Qualifier("cricketCoach") Coach theCoach) {
////        coach = theCoach;
//////        coach2 = theCoach2;
////    }
//
////    @Autowired
////    public DemoController(@Qualifier("couldBeAnyThing") Coach theCoach) {
////        System.out.println("In constructor Demo Controller");
////        coach = theCoach;
//////        coach2 = theCoach2;
////    }
//
//    @Autowired
//    public DemoController(StudentDAO studentDAO) {
//        this.studentDAO = studentDAO;
//    }
//
//    @GetMapping("/daily-workout")
//    public String getDailyWorkOut() {
//        return coach.getDailyWorkout();
//    }
//
////    @GetMapping("/check")
////    public String check() {
////        return "c1 == c2 " + (coach == coach2);
////    }
//
//    @GetMapping("student/{id}")
//    public Student readStudent(@PathVariable Long id) {
//
//        if (studentDAO.findById(id) == null) {
//            throw new StudentNotFoundException("Student not found by the id: " + id);
//        }
//
//        return studentDAO.findById(id);
//    }
}
