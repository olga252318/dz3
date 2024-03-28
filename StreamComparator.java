import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        int rersultOfComparing = o1.getGroupId().compareTo(o2.getGroupId());
        if (rersultOfComparing == 0) {
            rersultOfComparing = o1.getGroupName().compareTo(o2.getGroupName());
        } else {
            return rersultOfComparing;
        }
        return 0;
    }   
    
}
