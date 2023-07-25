package com.learnjpaandhibernate.jpaandhibernate.course;

import com.learnjpaandhibernate.jpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.learnjpaandhibernate.jpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn JPA","Shubham"));
        repository.insert(new Course(2,"Learn JPA","Mahale"));
        repository.insert(new Course(3,"Learn JPA","IronMan"));
        repository.deleteById(1);
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
