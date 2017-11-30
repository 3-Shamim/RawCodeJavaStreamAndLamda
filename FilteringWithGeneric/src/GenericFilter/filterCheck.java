package GenericFilter;

import filteringwithgeneric.Student;

/**
 *
 * @author SHAMIM
 */
@FunctionalInterface
public interface filterCheck {
    public boolean test(Student s);
    // Only one Abstruct Method
//    public boolean test1();
    public default void test3()
    {
        System.out.println("Default Method are ok unlimited");
    }
}
