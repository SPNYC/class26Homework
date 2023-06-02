package class26.Homework;

import java.util.ArrayList;
import java.util.List;

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class SumOfArrayList {
    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(60);
        numbers.add(80);
        numbers.add(90);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all integers: " + sum);
    }
    }

