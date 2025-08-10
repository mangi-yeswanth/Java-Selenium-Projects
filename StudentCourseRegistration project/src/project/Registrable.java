package project;
public interface Registrable {
    void registerCourse(Course course) throws CourseAlreadyRegisteredException;
    void dropCourse(String courseCode) throws CourseNotFoundException;
}