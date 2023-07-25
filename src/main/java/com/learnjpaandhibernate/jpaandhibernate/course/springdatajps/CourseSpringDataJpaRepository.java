package com.learnjpaandhibernate.jpaandhibernate.course.springdatajps;

import com.learnjpaandhibernate.jpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {
}
