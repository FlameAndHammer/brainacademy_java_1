package udovenko.labwork37.teststream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by gladi on 15.11.2016.
 */
public class TestStream {
    public static void main(String[] args) {
        List<Integer> integerList = Stream.<Integer>iterate(10, i -> i + 10).limit(10)
                .map(i -> i/2).collect(Collectors.toList());
        System.out.print("List of Integer: ");
        System.out.println(integerList);

        System.out.println("\nStrings, starts with 'T':");
        List<String> stringList = Arrays.asList("Nikulin", "Kulkov", "Shevchenko",
                "Torba", "Tretiak", "Udovenko", "Vityaz", "Todorov", "Derbyuk", "Mitrofanov");
        stringList.stream().filter(s -> s.startsWith("T")).sorted().forEach(System.out::println);

        List<Person> personList = Arrays.asList(new Person("Ivan", 16, Person.Sex.MALE),
                new Person("Peter", 23, Person.Sex.MALE),
                new Person("Helena", 22, Person.Sex.FEMALE), new Person("Alexander", 69, Person.Sex.MALE),
                new Person("Nina", 42, Person.Sex.FEMALE), new Person("Igor", 26, Person.Sex.MALE),
                new Person("Olena", 30, Person.Sex.FEMALE), new Person("Maxsim", 34, Person.Sex.MALE));
        System.out.println("\nMilitary men:");
        personList.stream().filter(p -> p.getAge() >= 18 && p.getAge() < 27 && p.getGender() == Person.Sex.MALE)
                .sorted((p1, p2) -> p1.getAge() - p2.getAge()).forEach(System.out::println);

        double avgAgeWomen = personList.stream().filter(p -> p.getGender() == Person.Sex.FEMALE)
                .mapToInt(Person::getAge).average().getAsDouble();
        System.out.printf("\nAverage age women from list: %.2f\n", avgAgeWomen);
    }
}
