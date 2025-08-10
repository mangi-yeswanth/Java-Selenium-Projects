package project;

public class Course {
    private String courseid;
    private String name;

    public Course(String courseid, String name) {
        this.courseid=courseid;
        this.name = name;
    }

    public String getCourseid() {
        return courseid;
    }
    public String getName() {
        return name;
    }
}
