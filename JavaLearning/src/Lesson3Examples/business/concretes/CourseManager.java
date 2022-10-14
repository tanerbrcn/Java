package Lesson3Examples.business.concretes;

import Lesson3Examples.core.ILogger;
import Lesson3Examples.dataAccess.abstracts.ICourseRepository;
import Lesson3Examples.entities.Course;


public class CourseManager {
    private ICourseRepository iCourseRepository;
    private ILogger[] iLoggers;

    public CourseManager(ICourseRepository iCourseRepository, ILogger[] iLoggers) {
        this.iCourseRepository = iCourseRepository;
        this.iLoggers = iLoggers;
    }

    public void add(Course course) throws Exception {
        Course[] courses = {
                new Course(1, "Backend Course"),
                new Course(2, "Frontend Course")
        };

        for (Course cour : courses) {
            if (cour.getName() == course.getName()) {
                throw new Exception("Course name tekrar edemez");
            }
        }
        iCourseRepository.add(course);
        for (ILogger iLogger : iLoggers) {
            iLogger.log(course.getName());
        }
    }

}
