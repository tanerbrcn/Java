package Lesson3Examples.dataAccess.concretes;

import Lesson3Examples.dataAccess.abstracts.ICourseRepository;
import Lesson3Examples.entities.Course;

public class HibernateCourseRepository implements ICourseRepository {
    @Override
    public void add(Course course) {
        System.out.println("Course Hibernate ile veritabanına eklendi.");
    }
}
