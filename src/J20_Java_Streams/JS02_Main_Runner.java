package J20_Java_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JS02_Main_Runner {
    public static void main(String[] args) {

        ArrayList<JS02_Employee> employeeList = new ArrayList<JS02_Employee>();
        employeeList.add(new JS02_Employee(104, "Falak", "DevOps", 30000));
        employeeList.add(new JS02_Employee(101, "Ashish", "BA", 15000));
        employeeList.add(new JS02_Employee(103, "Ekta", "Dev", 25000));
        employeeList.add(new JS02_Employee(102, "Chandrika", "QA", 20000));

        employeeList.forEach(e -> System.out.println(e));

        System.out.println("\nList of all employees whose salary is greater than 20000");
        List<JS02_Employee> resultBySalary = employeeList.stream().filter(e -> e.getSalary() > 20000).toList();
        System.out.println(resultBySalary);

        System.out.println("\nSort the list of all employees on the basis of Salary");
        List<JS02_Employee> resultSortedBySalary = employeeList.stream()
                .sorted((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()))
                .collect(Collectors.toList());
        System.out.println(resultSortedBySalary);

    }

}