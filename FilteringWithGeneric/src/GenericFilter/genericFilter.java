package GenericFilter;

import filteringwithgeneric.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author SHAMIM
 */
public class genericFilter<T> {
    // it's ok but this to lenghty , 
    // for this you need to create too many method 
    // for each type you need to implement  a method 
    public List<Student> getSubset(List<Student> list,int i)
    {
        List<Student> newList = new ArrayList<>();
        
        for (Student student : list) {
            if(student. getId() > i)
            {
                newList.add(student);
            }
        }
        
        return newList;
    }
    // this is to good and easy to use
    public List<Student> getSubsetByInterface(List<Student> list, filterCheck filterCheck)
    {
        List<Student> newList = new ArrayList<>();
        
        for (Student student : list) {
            if(filterCheck.test(student))
            {
                newList.add(student);
            }
        }
        
        return newList;
    }
    // By Generic
    public Collection<T> getSubsetByGeneric(Collection<T> list, CheckForGeneric<T> filterCheck)
    {
        List<T> newList = new ArrayList<>();
        
        for (T t : list) {
            if(filterCheck.test(t))
            {
                newList.add(t);
            }
        }
        
        return newList;
    }
}
