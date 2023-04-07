package Streams;

//Java program for list convert  in map
//with the help of Collectors.toMap() method

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

//create a list
class Employee {

	private Integer empid;
    private String name;
    private String designation;
 // create curstuctor for reference
 public Employee(Integer empid,String name,String designation)
 {
	 this.empid = empid;
     this.name = name;
     this.designation = designation;
    
 }



public Integer getEmpid() {
	return empid;
}



public void setEmpid(Integer empid) {
	this.empid = empid;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getDesignation() {
	return designation;
}



public void setDesignation(String designation) {
	this.designation = designation;
}



public class GFG {

 // main Driver
 public static void main(String[] args)
 {

     // create a list
	 List<Employee> empList = new ArrayList<Employee>();
     empList.add(new Employee(1,"Robert","Manager"));
     empList.add(new Employee(2,"Martin","General Manager"));
     empList.add(new Employee(3,"Jack","Manager"));
     // create map with the help of
     // Collectors.toMap() method
     LinkedHashMap<Integer, String>
         map = empList.stream()
                   .collect(
                       Collectors
                           .toMap(
                               Employee::getEmpId,
                               Employee::getDesignation,
                               (x, y)
                                   -> x + ", " + y,
                               LinkedHashMap::new));

     // print map
     map.forEach(
         (x, y) -> System.out.println(x + "=" + y));
 }
}