package advancesortingdemo;

import Filter.Filter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import sortModel.Generator;
import sortModel.GeneralSort;
import sortModel.SortedbyCgpa;
import sortModel.SortedbyName;

/**
 *
 * @author SHAMIM
 */
public class AdvanceSortingDemo {

    // Inner Class
    class sortedByCgpaInnerClass implements Comparator<Student> {

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

    public AdvanceSortingDemo() {
        /*
        
        GeneralSort generalSort =  new GeneralSort();
        // int
        int[] intNumber = {50,5,4,7,4,85,74,5,-8,-56,54,8,26,74,57};
        generalSort.intSort(intNumber);
        
        // String
        String[] StringValue = {"java","c","ruby","python","c++","javascript"};
        generalSort.StringSort(StringValue);

        // List
        generalSort.ListSort(Arrays.asList(StringValue));
        
         */

        // Custom List sort
        Generator advanceSorting = new Generator();

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            studentList.add(new Student(
                    advanceSorting.nameGenerator(),
                    advanceSorting.CgpaGenarator(),
                    advanceSorting.emailGenerator()));
        }

        System.out.println("Before");
//        studentList.forEach(System.out::println);

        System.out.println("After");
//        Collections.sort(studentList, new SortedbyName());
//        Collections.sort(studentList, new SortedbyCgpa());
//        Collections.sort(studentList, new sortedByCgpaInnerClass());
//        Collections.sort(studentList, new Comparator<Student>() {
//            // Anonymous Inner Class
//            @Override
//            public int compare(Student s1, Student s2) {
//                if ((s1.getCgpa() - s2.getCgpa()) < 0) {
//                    return -1;
//                } else if ((s1.getCgpa() - s2.getCgpa()) > 0) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
        // Lamda Expression
        // full Condition
        // for cgpa 
        Collections.sort(studentList, (s1, s2) -> {
            if ((s1.getCgpa() - s2.getCgpa()) < 0) {
                return -1;
            } else if ((s1.getCgpa() - s2.getCgpa()) > 0) {
                return 1;
            } else {
                return 0;
            }
        });
        // single line
        // for name
//        Collections.sort(studentList, (s1, s2) -> s1.getName().compareTo(s2.getName()));
//        Collections.sort(studentList, (s1, s2) -> s1.getEmail().compareTo(s2.getEmail()));

        studentList.forEach(System.out::println);

        // Filtering by Default Method
//        List<Student> filterList = studentList
//                .parallelStream()
//                .filter(list -> list.getEmail().endsWith(".com"))
//                .collect(Collectors.toList());
//        System.out.println("Filtered");
//        filterList.forEach(System.out :: println);
        
        // Filtering by Own method
        
        Filter filter = new Filter();
        List<Student> subSet = filter.getSubset(studentList, ".com");
        System.out.println("Filtered");
        subSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new AdvanceSortingDemo();
    }

}
