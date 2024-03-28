import java.util.List;

public class Controller {
    
    private final StreamComparator streamComparator = new StreamComparator();

    public List<StudentGroup> getSortedGroupName(){
        return streamComparator.getSortedGroupName();
    }
}
