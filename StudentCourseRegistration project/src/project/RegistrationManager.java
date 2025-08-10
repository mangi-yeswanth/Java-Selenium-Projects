package project;

import java.util.ArrayList;
import java.util.List;

public class RegistrationManager {
    private List<Student> students;
    private List<Course> courses;

    public RegistrationManager() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Student findStudent(String studentId) {
        for (Student s : students) {
            if (s.getId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    public Course findCourse(String courseCode) {
        for (Course c : courses) {
            if (c.getCourseid().equals(courseCode)) {
                return c;
            }
        }
        return null;
    }
}
