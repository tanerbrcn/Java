package Lesson3Examples.dataAccess.concretes;

import Lesson3Examples.dataAccess.abstracts.IInstructorRepository;
import Lesson3Examples.entities.Instructor;

public class HibernateInstructorRepository implements IInstructorRepository {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor Hibernate ile veritabanına eklendi.");
    }
}
