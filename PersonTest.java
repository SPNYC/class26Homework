package class26.Homework;
/*
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.

In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details
 */

import java.util.Map;
import java.util.TreeMap;

public class PersonTest {
    public static void main(String[] args) {
        TreeMap<String, Person> map=new TreeMap<>();
        map.put("9876ABC",new Person("John","Smith",45,125000.50));
        map.put("1234CBA",new Person("Jack","Smith",45,120000.0));
        map.put("5432PKN",new Person("Kelly","Smith",45,135500.0));
        for (Map.Entry<String, Person> stringPersonEntry : map.entrySet()) {
            System.out.println(stringPersonEntry.getKey()+" "+stringPersonEntry.getValue());
        }

        }
    }

