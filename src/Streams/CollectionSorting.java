package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSorting {
    public static void main(String[] args) {

        List < String > employee = new ArrayList < String > ();
        employee.add("Krushna");
        employee.add("Rahul");
        employee.add("Pratik");
        employee.add("Sachin");
        employee.add("Nishant");

        List < String > sortedList=employee.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);

	   List < String > sortedList3=employee.stream().sorted((i1,i2) -> i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(sortedList3);
        
        List < String >sortedList2=employee.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList2);
        
        List < String > sortedList4=employee.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(sortedList4);
    }
}
