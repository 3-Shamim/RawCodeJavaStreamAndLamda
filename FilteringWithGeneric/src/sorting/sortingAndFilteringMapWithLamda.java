package sorting;

import filteringwithgeneric.Student;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author SHAMIM
 */
public class sortingAndFilteringMapWithLamda {

    public Map getSortedMap(Map<Integer, Student> studentMap) {
        Map sortedMap = new HashMap();
        
        // Need to fix
//        studentMap.entrySet()
//                .stream()
//                .sorted(Map.Entry.<Integer,Student>comparingByValue((s1, s2) -> {
//                    return s1.getEmail().compareTo(s2.getEmail());
//                }))
//                .forEach(x -> sortedMap.put(x.getKey(), x.getValue()));

        // Another Mehods
        sortedMap = studentMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((s1, s2) -> {
                    return s1.getId() - s2.getId();
                }))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
        // Second methods
//        sortedMap = studentMap.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByKey())
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
//                (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        return sortedMap;
    }

    public Map getFilteredMap(Map<Integer, Student> studentMap) {
        // Filter
        Map filterMap = new HashMap<>();

//        studentMap.entrySet()
//                .stream()
//                .filter(student -> student.getValue().getEmail().endsWith(".net"))
//                .forEach(x -> filterMap.put(x.getKey(), x.getValue()));
        // Second Methods
        filterMap = studentMap.entrySet()
                .stream()
                .filter(student -> student.getValue().getEmail().endsWith(".net"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        return filterMap;
    }
}
