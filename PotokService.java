import java.util.ArrayList;
import java.util.List;

public class PotokService {

    private Potok potok;

    public List<StudentGroup> getSortedGroupName() {
        List<StudentGroupIterator> studentList = new ArrayList<>(potok.getStudentList());
        studentList.sort(new StreamComparator());
        return studentList; 
    }
}
