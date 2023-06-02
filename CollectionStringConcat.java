package class26.Homework;

import java.util.LinkedHashSet;

/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection. OUTPUT should be "I like Syntax"
 */
public class CollectionStringConcat {
    public static void main(String[] args) {

        LinkedHashSet<String> str=new LinkedHashSet<>();
        str.add("I");
        str.add("like");
        str.add("Syntax");

        StringBuilder concatenatedString = new StringBuilder();
        for (String s : str) {
            concatenatedString.append(s).append(" ");
        }

        System.out.print(concatenatedString.toString());
    }

    }

