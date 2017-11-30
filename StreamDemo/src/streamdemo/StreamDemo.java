package streamdemo;

import Generator.Generator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SHAMIM
 */
public class StreamDemo {

    public StreamDemo() {
        Generator g = new Generator();
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Person(g.getName(), g.getAge()));
        }
//        list.forEach(System.out ::  println);
//        list.stream().forEach(Person :: printUppercaseName);
//        System.out.println();
//        list.stream().forEach(person -> person.getPrintWithPramiter(7));
//        List<Person> newList;
//        newList = list.stream().filter(Person -> Person.getAge() > 20).filter(person -> person.getName().startsWith("A")).collect(Collectors.toList());
//        newList.forEach(System.out :: println);
//        list.stream().filter(person -> person.getAge() > 20).forEach(System.out :: println);
        double avg = list.stream().filter(person -> person.getAge() > 20).mapToInt(Person :: getAge).average().getAsDouble();
        list.forEach(System.out::println);
        
        System.out.println(avg);
        
    }

    public static void main(String[] args) {
        new StreamDemo();
    }
}
