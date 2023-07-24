package com.learnjpaandhibernate.jpaandhibernate.course.jdbc;

import com.learnjpaandhibernate.jpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private  CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn AWS","Shubham"));
        repository.insert(new Course(2,"Learn Azure","Mahale"));
        repository.insert(new Course(3,"Learn DevOps","IronMan"));
        repository.deleteById(1);
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
