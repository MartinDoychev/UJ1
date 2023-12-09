import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<String> classes;
    private List<Student4> students;

    public School(String name) {
        this.name = name;
        this.classes = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addStudent(Student4 student) {
        students.add(student);
        classes.add(student.getSchoolClass());
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public int getNumberOfClasses() {
        return classes.size();
    }

    public List<Student4> getStudents() {
        return students;
    }
}