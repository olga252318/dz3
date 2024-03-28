import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<StudentGroup>  {

    private int count;
    private final List<StudentGroup> studentList;

    public StudentGroupIterator(Potok studentGroup){
        this.count = 0;
        this.studentList = studentGroup.getStudentList();
    }


    public boolean hasNext(){
        return count < studentList.size() - 1;
    }

    public StudentGroup next(){
        if(hasNext()){
            return null;
        }
        count++;
        return studentList.get(count);
    }
    
    public void remove(){
        studentList.remove(count);
    }
}
    
