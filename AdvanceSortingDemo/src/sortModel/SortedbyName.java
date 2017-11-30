package sortModel;

import advancesortingdemo.Student;
import java.util.Comparator;

/**
 *
 * @author SHAMIM
 */
public class SortedbyName implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        // full condition for sorting 
       if(s1.getName().compareTo(s2.getName()) < 0)
       {
           return -1;
       }
       else if(s1.getName().compareTo(s2.getName()) > 0)
       {
           return 1;
       }
       else
       {
           if(s1.getCgpa() - s2.getCgpa() *  10 < 0 )
           {
               return -1;
           }
           else if(s1.getCgpa() - s2.getCgpa() *  10 > 0 )
           {
               return 1;
           }
           else
           {
               return 0;
           }
       }

        // this is single line for sorting
//        return s1.getName().compareTo(s2.getName());
    }
    
    
    
}
