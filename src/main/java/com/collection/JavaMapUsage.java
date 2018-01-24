package com.collection;

import com.collection.dto.Department;
import com.collection.dto.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This shows the java list usage.
 *
 * @author hao.e.chen
 * @date 21/01/2018
 */
public class JavaMapUsage {
    /**
     * here will show some java 8 aggregate operation for map collection
     **/
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A", 2000, new Department("Digital")));
        employees.add(new Employee("B", 3000, new Department("Digital")));
        employees.add(new Employee("C", 4000, new Department("Macao")));
        employees.add(new Employee("D", 2500, new Department("Airport")));
        employees.add(new Employee("E", 2800, new Department("Testing")));
        employees.add(new Employee("F", 2800, new Department("Testing")));

        Map<Department, List<Employee>> result1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("result 1 : " + result1);

        //Please be noted that , the Department class must override the hashCode and equals function ,
        // otherwise , will use the physical address to compare the department
        Map<Department, Integer> result2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingInt(Employee::getSalary)));

        System.out.println("result 2 : " + result2);

    }
}
