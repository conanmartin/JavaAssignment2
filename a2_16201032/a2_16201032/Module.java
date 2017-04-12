package a2_16201032;

/**
 * Created by conanmartin on 10/04/2017.
 */
public class Module {
    private String code;
    private String title;
    private Instructor instructor;
    final int MAX_NUMBER_STUDENTS = 80;
    private Student[] students = new Student[MAX_NUMBER_STUDENTS];
    private int studentCounter = 0;


    public Module(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }

    public String getInstructor() {
        if (this.instructor == null) {
            return "not set";
        }
        else {
            return this.instructor.toString();
        }
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public boolean addStudent (Student s) {
        if (this.studentCounter < MAX_NUMBER_STUDENTS){
            students[this.studentCounter] = s;
            this.studentCounter++;
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString() {
        String studentsInModule = "students: ";
        if (studentCounter == 0){
            studentsInModule += "\n \t \tnone";
        }
        else {
            for (int i = 0; i < studentCounter; i++){
                studentsInModule += "\n \t \t" + students[i].getName();
            }
        }

        String instructorName = "";
        if (this.instructor == null) {
            instructorName = "not set";
        }
        else {
            instructorName = this.instructor.getName().toString();
            }

        return "code: " + getCode() + "\ntitle: " + getTitle() + "\ninstructor: " + instructorName + "\n" + studentsInModule +"\n";
    }
}
