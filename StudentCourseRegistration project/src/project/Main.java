package project;


public class Main {
    public static void main(String[] args) {
        try {
            RegistrationManager manager = new RegistrationManager();

            // Add courses
            Course c1 = new Course("C101", "Java Programming");
            Course c2 = new Course("C102", "Database Systems");
            manager.addCourse(c1);
            manager.addCourse(c2);

            // Add student
            Student s1 = new Student("S001", "John Doe");
            manager.addStudent(s1);

            // Register courses
            s1.registerCourse(c1);
            s1.registerCourse(c2);

            // Try duplicate registration
            try {
                s1.registerCourse(c1);
            } catch (CourseAlreadyRegisteredException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Drop a course
            s1.dropCourse("C102");

            // Try dropping non-existent course
            try {
                s1.dropCourse("C105");
            } catch (CourseNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}