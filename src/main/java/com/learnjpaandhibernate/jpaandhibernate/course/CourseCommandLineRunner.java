package com.learnjpaandhibernate.jpaandhibernate.course;

import com.learnjpaandhibernate.jpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.learnjpaandhibernate.jpaandhibernate.course.jpa.CourseJpaRepository;
import com.learnjpaandhibernate.jpaandhibernate.course.springdatajps.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn JPA","Shubham"));
        repository.save(new Course(2,"Learn JPA","Mahale"));
        repository.save(new Course(3,"Learn JPA","IronMan"));
        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByAuthor("IronMan"));
        System.out.println(repository.findByName("Learn JPA"));

    }
}
