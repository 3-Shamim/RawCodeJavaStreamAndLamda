package GenericFilter;

/**
 *
 * @author SHAMIM
 * @param <T>
 */
public interface CheckForGeneric<T> {
        public boolean test(T t);
    // Only one Abstruct Method
//    public boolean test1();
    public default void test3()
    {
        System.out.println("Default Method are ok unlimited");
    }
}
