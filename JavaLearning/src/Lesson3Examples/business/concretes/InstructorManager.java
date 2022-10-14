package Lesson3Examples.business.concretes;

import Lesson3Examples.core.ILogger;
import Lesson3Examples.dataAccess.abstracts.IInstructorRepository;
import Lesson3Examples.entities.Instructor;

public class InstructorManager {

    private IInstructorRepository iInstructorRepository;
    private ILogger[] iLoggers;

    public InstructorManager(IInstructorRepository iInstructorRepository, ILogger[] iLoggers) {
        this.iInstructorRepository = iInstructorRepository;
        this.iLoggers = iLoggers;
    }

    public void add(Instructor instructor) throws Exception {
        Instructor[] instructors = {
                new Instructor(1, "Engin", "Demiroğ"),
                new Instructor(1, "Taner", "Brcn")
        };

        for (Instructor inst : instructors) {
            if (inst.getName() == instructor.getName()) {
                throw new Exception("Instructor name tekrar edemez");
            }
        }
        iInstructorRepository.add(instructor);
        for (ILogger iLogger : iLoggers) {
            iLogger.log(instructor.getName());
        }


    }
}
