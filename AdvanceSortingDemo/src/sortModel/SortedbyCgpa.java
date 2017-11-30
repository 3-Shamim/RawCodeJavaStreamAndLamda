package sortModel;

import advancesortingdemo.Student;
import java.util.Comparator;

/**
 *
 * @author SHAMIM
 */
public class SortedbyCgpa implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if ((s1.getCgpa() - s2.getCgpa()) < 0) {
            return -1;
        } else if ((s1.getCgpa() - s2.getCgpa()) > 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
