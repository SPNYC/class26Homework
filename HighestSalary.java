package class26.Homework;

import java.util.HashMap;
import java.util.Map;

/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
 */
public class HighestSalary {
    public static void main(String[] args) {
        Map<String,Integer> employeeSalary=new HashMap<>();
        employeeSalary.put("John Smith",100000);
        employeeSalary.put("Jane Smith",50000);
        employeeSalary.put("Jack Smith",70000);
        employeeSalary.put("James Smith",80000);
        employeeSalary.put("Jacob Smith",90000);


        String highestPaidEmployee = "";
        int highestSalary = 0;

        for (Map.Entry<String, Integer> entry : employeeSalary.entrySet()) {
            String employeeName = entry.getKey();
            int salary = entry.getValue();

            if (salary > highestSalary) {
                highestSalary = salary;
                highestPaidEmployee = employeeName;
            }
        }
        System.out.println(highestPaidEmployee + "=$" + highestSalary);
    }
}
