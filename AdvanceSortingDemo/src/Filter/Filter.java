package Filter;

import advancesortingdemo.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SHAMIM
 */
public class Filter {
    
    public List getSubset(List<Student> list, String s)
    {
        List<Student> newList = new ArrayList<>();
        for (Student student : list) {
            if(student.getEmail().endsWith(s))
            {
                newList.add(student);
            }
        }
        return newList;
    }
}
