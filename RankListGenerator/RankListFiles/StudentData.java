package RankListFiles;
import java.io.Serializable;

public class StudentData  implements Serializable{
    private String studentName;
    private Float studentMarks;
    private Long rollNumber;
    
    public StudentData(long rollNumber, String name, Float marks) {
        this.rollNumber = rollNumber;
        this.studentName = name;
        this.studentMarks = marks;
    }
    public String getStudentName() {
        return studentName;
    }
    public Float getStudentMarks() {
        return studentMarks;
    }
    public Long getRollNumber() {
        return rollNumber;
    }
}
