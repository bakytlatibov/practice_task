import java.util.Arrays;

public class School implements Service {
    private String schoolName;
    private Student[] students;

    public School(String schoolName, Student[] students) {
        this.schoolName = schoolName;
        this.students = students;
    }

    @Override
    public Student findByName(String studentName) {
        return null;
    }

    @Override
    public void getAllStudents() {

    }

    @Override
    public Student[] getAllGirls() {
        return new Student[0];
    }

    @Override
    public void getMaxEstimation() {

    }

    @Override
    public double getAverageEstimation() {
        return 0;
    }

    @Override
    public void getAverageAge() {

    }

    @Override
    public String toString() {
        return "School " +
                "schoolName: " + schoolName +
                "students: " + Arrays.toString(students);
    }

}
