package Lesson3Examples;

import Lesson3Examples.business.concretes.CategoryManager;
import Lesson3Examples.business.concretes.CourseManager;
import Lesson3Examples.business.concretes.InstructorManager;
import Lesson3Examples.core.DatabaseLogger;
import Lesson3Examples.core.FileLogger;
import Lesson3Examples.core.ILogger;
import Lesson3Examples.core.MailLogger;
import Lesson3Examples.dataAccess.concretes.HibernateCategoryRepository;
import Lesson3Examples.dataAccess.concretes.HibernateInstructorRepository;
import Lesson3Examples.dataAccess.concretes.JdbcCourseRepository;
import Lesson3Examples.dataAccess.concretes.JdbcInstructorRepository;
import Lesson3Examples.entities.Category;
import Lesson3Examples.entities.Course;
import Lesson3Examples.entities.Instructor;


public class Main {
    public static void main(String[] args) throws Exception{

       /* Category category=new Category(4,"Backend Category"); // Bu aktif iken name tekrar edemez hatası verir. */
        Category category2=new Category(4,"Test Category");
        Course course=new Course(4,"Test Course");
        Instructor instructor=new Instructor(4,"Tamer","Brcn");
        ILogger[] iLoggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};

        CategoryManager categoryManager=new CategoryManager(new HibernateCategoryRepository(),iLoggers);
        CourseManager courseManager=new CourseManager(new JdbcCourseRepository(),iLoggers);
        InstructorManager instructorManager=new InstructorManager(new HibernateInstructorRepository(),iLoggers);

      /*  categoryManager.add(category); // Bu aktif iken name tekrar edemez hatası verir. */
        categoryManager.add(category2);
        courseManager.add(course);
        instructorManager.add(instructor);

    }
}
