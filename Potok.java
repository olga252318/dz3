import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<StudentGroup> {
    
    private List<StudentGroup> studentList;

    public List<StudentGroup> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentGroup> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(this);
    }


    
}
