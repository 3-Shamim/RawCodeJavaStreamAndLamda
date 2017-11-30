package filteringwithgeneric;

import Generator.Generator;
import GenericFilter.CheckForGeneric;
import GenericFilter.filterCheck;
import GenericFilter.genericFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import sorting.sortingAndFilteringMapWithLamda;

/**
 *
 * @author SHAMIM
 */
public class FilteringWithGeneric {

    public FilteringWithGeneric() {
        Generator generator = new Generator();
        sorting.sortingAndFilteringMapWithLamda mapWithLamda = new sortingAndFilteringMapWithLamda();
        List<Student> list = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();
        Map<Integer, Student> studentMap = new HashMap<>();

        // List of Student
        for (int i = 0; i < 50; i++) {
            list.add(new Student(
                    generator.idGenerator(),
                    new Name(generator.firstNameGenerator(), generator.lastNameGenerator()),
                    generator.emailGenerator()
            ));
        }
        
        // List of Course
        for (int i = 0; i < 50; i++) {
            courseList.add(new Course(generator.courseCodeGenerator(), generator.courseTitleGenerator()));
        }
        
        // Sort
        Collections.sort(list, (s1, s2) -> s1.getId() - s2.getId());
        list.forEach(System.out::println);


        // Hash Map Sorting And Filtering
        for (int i = 0; i < 50; i++) {
            Student student = new Student(
                    generator.idGenerator(),
                    new Name(generator.firstNameGenerator(), generator.lastNameGenerator()),
                    generator.emailGenerator()
            );
            studentMap.put(student.getId(), student);
        }
        
        // Orginal
//        studentMap.forEach((key, value) -> {
//            System.out.println("Key " + key + "\n Value " + value);
//        });
//        System.out.println();

        // Sorting
//        Map sortedMap = new HashMap();
//        sortedMap = mapWithLamda.getSortedMap(studentMap);
//        sortedMap.forEach((key, value) -> {
//            System.out.println("Key " + key + "\n Value " + value);
//        });
//        System.out.println();
        
        
        // Filtering
//        Map filterMap = new HashMap();
//        filterMap = mapWithLamda.getFilteredMap(studentMap);
//        filterMap.forEach((key, value) -> {
//            System.out.println("Key " + key + "\n Value " + value);
//        });
//        System.out.println(studentMap.size());

        // Filtering By Generic Own Method
        genericFilter filter = new genericFilter();
        List<Student> subSetList = new ArrayList<>();
//        subSetList = filter.getSubset(list, 30);
        
        // By Implementing anonymous inner interface
//        subSetList = filter.getSubsetByInterface(list, new filterCheck() {
//            @Override
//            public boolean test(Student s) {
//                return s.getName().getFirstName().startsWith("A");
//            }
//        });
        
//        subSetList = filter.getSubsetByInterface(list, new filterCheck() {
//            @Override
//            public boolean test(Student s) {
//                return s.getId() > 30;
//            }
//        });

        // By implementing Generic with anonymous inner interface
        genericFilter<Student> studentSubset =  new genericFilter<>();
//        Collection<Student> studentGenericList = studentSubset.getSubsetByGeneric(list, new CheckForGeneric<Student>() {
//            @Override
//            public boolean test(Student t) {
//                return t.getId() > 30;
//            }
//        });
        
        Collection<Student> studentGenericList = studentSubset.getSubsetByGeneric(list,(student) -> student.getId() > 30);
        
        System.out.println();
        subSetList.forEach(System.out::println);
        studentGenericList.forEach(System.out::println);
        
        genericFilter<Course> filter1 = new genericFilter<>();
//        Collection<Course> courseSubset = filter1.getSubsetByGeneric(courseList, new CheckForGeneric<Course>() {
//            @Override
//            public boolean test(Course t) {
//                return  t.getCode().startsWith("Math");
//            }
//        });
        Collection courseSubset = filter1.getSubsetByGeneric(courseList, (course) -> course.getCode().startsWith("ENG"));
        System.out.println();
        courseList.forEach(System.out::println);
        System.out.println();
        courseSubset.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new FilteringWithGeneric();
    }

}
