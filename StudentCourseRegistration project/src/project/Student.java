package project;


import java.util.ArrayList;
import java.util.List;

public class Student extends RegisterStudent implements Registrable {
    private List<Course> registeredCourses;

    public Student(String id, String name) {
        super(id, name);
        this.registeredCourses = new ArrayList<>();
    }

    public void registerCourse(Course course) throws CourseAlreadyRegisteredException {
        for (Course c : registeredCourses) {
            if (c.getCourseid().equals(course.getCourseid())) {
                throw new CourseAlreadyRegisteredException(
                        "Course already registered: " + course.getName());
            }
        }
        registeredCourses.add(course);
        System.out.println(getName() + " registered for " + course.getName());
    }

    public void dropCourse(String courseCode) throws CourseNotFoundException {
        boolean removed = registeredCourses.removeIf(c -> c.getCourseid().equals(courseCode));
        if (!removed) {
            throw new CourseNotFoundException("Course not found: " + courseCode);
        }
        System.out.println(getName() + " dropped " + courseCode);
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }
}
